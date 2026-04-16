package com.subrat.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.subrat.entity.MarraigeSeeker;
import com.subrat.service.Iservice;

public class Runner implements CommandLineRunner {
@Autowired
	private Iservice serv;
	@Override
	public void run(String... args) throws Exception {
		Long id = Long.parseLong(IO.readln("enter id"));
		String name = IO.readln("enter string name");
		String address = IO.readln("enter address");
		String photoPath = IO.readln("enter your photopath").replaceAll("?", "");
		String resumePath = IO.readln("enter your resumePath").replaceAll("?", "");
		
		InputStream is=new FileInputStream(photoPath);
		byte[]photoData=new byte[is.available()];
		photoData=is.readAllBytes();
		
		File file=new File(resumePath);
		Reader reader=new FileReader(file);
		char resumeContent[]=new char[(int)file.length()];
		reader.read(resumeContent);
		
		MarraigeSeeker seeker=new MarraigeSeeker(id,name,address,photoData,resumeContent);
		
		IO.println(serv.registerMarraigeSeeker(seeker));
		IO.println("==============================================================");
		Optional<MarraigeSeeker> opt=serv.searchSeekerById(id);
		if(opt.isPresent()) {
			MarraigeSeeker seek=opt.get();
			IO.readln(seek.getId()+" "+seek.getName()+" "+seek.getAddress());
			OutputStream os=new FileOutputStream("");
		}
		
	}
	

}
