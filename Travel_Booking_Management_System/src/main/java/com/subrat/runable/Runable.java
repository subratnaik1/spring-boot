package com.subrat.runable;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.controller.TravelController;
import com.subrat.entity.Travel;

@Component
public class Runable implements CommandLineRunner {
	@Autowired
	public TravelController tc;

	@Override
	public void run(String... args) throws Exception {

		while(true) {
			
			int choice = Integer.parseInt(IO.readln("enter your choicee"));
			IO.println("1.Add a new travel booking.");
			IO.println("2.Retrieve all travel bookings.");
			IO.println("3.Find a travel booking by ID");
			IO.println("Exit");
			switch (choice) {
			case 1 -> {
				long id = Integer.parseInt(IO.readln("enter id"));
				String destination = IO.readln("enter destination");
				String transportationMode = IO.readln("enter transportations mode");
				double price = Double.parseDouble(IO.readln("enter price"));
				Travel tr = new Travel();
				tr.setId(id);
				tr.setDestination(destination);
				tr.setPrice(price);
				tr.setTransportationMode(transportationMode);
				
				IO.println(tc.addTravel(tr));			
			}
			case 2 -> {
				tc.getAllTravels().forEach(IO::println);
				
//           for(Travel t:allTravels) {
//        	   IO.println(t.getId()+" "+t.getDestination()+" "+t.getPrice()+" "+t.getTransportationMode());
//           }
			}
			case 3 -> {
				long id = Integer.parseInt(IO.readln("enter id"));
				Optional<Travel> travelById = tc.findTravelById(id);
				IO.println(travelById.orElseThrow());
				
			}
			case 4 -> {
				System.exit(0);
				IO.println("thank you");
			}
			
			}
		}
	}

}
