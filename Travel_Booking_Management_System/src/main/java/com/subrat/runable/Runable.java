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
			
			IO.println("1.Add a new travel booking.");
			IO.println("2.Retrieve all travel bookings.");
			IO.println("3.Find a travel booking by ID");
			IO.println("4.Delete a travel booking by ID");
			IO.println("5.Check if a travel booking exists.");
			IO.println("6.Count total travel bookings.");
			IO.println("7.Delete a specific travel booking.");
			IO.println("8.Delete all travel bookings.");
			IO.println("Exit");
			int choice = Integer.parseInt(IO.readln("enter your choicee"));
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
			case 4->{
				long id = Integer.parseInt(IO.readln("enter id"));
				String deleteTravelById = tc.deleteTravelById(id);
				IO.println(deleteTravelById);
			}
			case 5->{
				long id = Integer.parseInt(IO.readln("enter id"));
				IO.println(tc.existsById(id));
			}
			case 6->{
				long count = tc.count();
				IO.println(count);
			}
			case 7->{
				
			}
			case 8->{
				tc.deleteAll();
				IO.println("deleted all records");
			}
			case 9 -> {
				System.exit(0);
				IO.println("thank you");
			}
			
			}
		}
	}

}
