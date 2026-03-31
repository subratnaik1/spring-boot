package com.subrat.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.controller.FoodController;
import com.subrat.entity.FoodOrder;
@Component
public class Runner implements CommandLineRunner {
	@Autowired
	public FoodController fc;

	@Override
	public void run(String... args) throws Exception {

		while (true) {
			IO.println("1. Add Order");
			IO.println("2. Add Multiple Orders");
			IO.println("3. View All Orders");
			IO.println("4. View Orders by IDs");
			IO.println("5. Find Order by ID");
			IO.println("6. Check Order Exists");
			IO.println("7. Count Orders");
			IO.println("8. Delete Order by ID");
			IO.println("9. Delete Orders by IDs");
			IO.println("10. Delete Specific Order");
			IO.println("11. Delete Selected Orders");
			IO.println("12. Delete All Orders");
			IO.println("13. Exit");

			int choice = Integer.parseInt(IO.readln("enter your choice"));
			switch (choice) {
			case 1 -> {
				long id = Long.parseLong(IO.readln("enter id"));
				String customerName = IO.readln("enter customer name");
				String foodItem = IO.readln("enter food item");
				int quantity = Integer.parseInt(IO.readln("enter quantity"));
				double pricePerItem = Double.parseDouble(IO.readln("enter price Item"));
				double totalAmount = Double.parseDouble(IO.readln("enter total ampunt"));

				FoodOrder f = new FoodOrder();
				f.setId(id);
				f.setCustomerName(customerName);
				f.setFoodItem(foodItem);
				f.setQuantity(quantity);
				f.setPricePerItem(pricePerItem);
				f.setTotalAmount(totalAmount);

				IO.println(fc.addOrder(f));
			}
			case 2 -> {
				List<FoodOrder> orders = new ArrayList<>();
				int items = Integer.parseInt(IO.readln("enter how many food items want to insert"));
				for (int i = 0; i < items; i++) {
					long id = Long.parseLong(IO.readln("enter id"));
					String customerName = IO.readln("enter customer name");
					String foodItem = IO.readln("enter food item");
					int quantity = Integer.parseInt(IO.readln("enter quantity"));
					double pricePerItem = Double.parseDouble(IO.readln("enter price Item"));
					double totalAmount = Double.parseDouble(IO.readln("enter total ampunt"));

					FoodOrder f = new FoodOrder();
					f.setId(id);
					f.setCustomerName(customerName);
					f.setFoodItem(foodItem);
					f.setQuantity(quantity);
					f.setPricePerItem(pricePerItem);
					f.setTotalAmount(totalAmount);

					orders.add(f);

				}
				IO.println(fc.addMultipleOrders(orders));
			}
			case 3 -> {
				 fc.findAll().forEach(IO::println);				
			}
			case 4->{
				List <Long> ids=new ArrayList<>();
				long x=Integer.parseInt(IO.readln("enter how many ids you want to enter"));
				for(int i=0;i<x;i++) {
					long id=Integer.parseInt(IO.readln("enter id"));
					ids.add(id);
				}	
				 fc.viewOrdersByIds(ids).forEach(IO::println);
				
			}
			case 5->{
				long id = Long.parseLong(IO.readln("enter id"));
                Optional<FoodOrder> viewOrdersById = fc.viewOrdersById(id);
                IO.println(viewOrdersById);
			}
			case 6->{
				long id = Long.parseLong(IO.readln("enter id"));
				boolean b=fc.checkOrderExists(id);
				IO.println(b);
			}
			case 7->{
				Long count=fc.countOrders();
				IO.println(count);
			}
			case 8 ->{
				long id = Long.parseLong(IO.readln("enter id"));
				IO.println(fc.deleteOrderById(id));
			}
			case 9 ->{
				List <Long> ids=new ArrayList<>();
				long x=Integer.parseInt(IO.readln("enter how many ids you want to enter"));
				for(int i=0;i<x;i++) {
					long id=Integer.parseInt(IO.readln("enter id"));
					ids.add(id);
				}
				IO.println(fc.deleteOrdersByIds(ids));
			}
			case 10 ->{
				long id = Long.parseLong(IO.readln("enter id"));
				String customerName = IO.readln("enter customer name");
				String foodItem = IO.readln("enter food item");
				int quantity = Integer.parseInt(IO.readln("enter quantity"));
				double pricePerItem = Double.parseDouble(IO.readln("enter price Item"));
				double totalAmount = Double.parseDouble(IO.readln("enter total ampunt"));

				FoodOrder f = new FoodOrder();
				f.setId(id);
				f.setCustomerName(customerName);
				f.setFoodItem(foodItem);
				f.setQuantity(quantity);
				f.setPricePerItem(pricePerItem);
				f.setTotalAmount(totalAmount);

				IO.println(fc.deleteSpecificOrder(f));
			}
			case 11 ->{
				List<FoodOrder> orders = new ArrayList<>();
				int items = Integer.parseInt(IO.readln("enter how many food items want to insert"));
				for (int i = 0; i < items; i++) {
					long id = Long.parseLong(IO.readln("enter id"));
					String customerName = IO.readln("enter customer name");
					String foodItem = IO.readln("enter food item");
					int quantity = Integer.parseInt(IO.readln("enter quantity"));
					double pricePerItem = Double.parseDouble(IO.readln("enter price Item"));
					double totalAmount = Double.parseDouble(IO.readln("enter total ampunt"));

					FoodOrder f = new FoodOrder();
					f.setId(id);
					f.setCustomerName(customerName);
					f.setFoodItem(foodItem);
					f.setQuantity(quantity);
					f.setPricePerItem(pricePerItem);
					f.setTotalAmount(totalAmount);

					orders.add(f);
				}
				IO.println(fc.deleteAll(orders));
			}
			case 12->{
				IO.println(fc.deleteAllOrders());
			}
			case 13->{
				System.exit(0);
			}
			}
		}

	}

}
