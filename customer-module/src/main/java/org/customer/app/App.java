package org.customer.app;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.customer.app.factory.CustomerFactory;
import org.customer.app.factory.CustomerFactoryImpl;
import org.customer.app.model.Customer;
public class App 
{
	
	static Customer customer=null;
    private static Scanner scanner=new Scanner(System.in);
	public static void main( String[] args)
    {
        try {
        	
        	CustomerFactory impl=new CustomerFactoryImpl();
        	
        	System.out.println("1.create customer.");
        	System.out.println("2.display all customer.");
        	System.out.println("3.find customer by id.");
        	System.out.println("4.update customer.");
        	System.out.println("5.remove customer.");
        	System.out.println("0.exit.");
        	System.out.println("Enter your choice");
        	int choice=scanner.nextInt();
        	do {
        		
        		switch(choice) {
        		
		        		case 1:
		        			System.out.println("ID:");
		        			int id=scanner.nextInt();
		        			System.out.println("NAME:");
		        			String name=scanner.next();
		        			System.out.println("EMAIL:");
		        			String email=scanner.next();
		        			customer=impl.createCustomer(id, name, email);
				        	System.out.print(customer.toString());
				        	break;
				        		
		        		case 2:
			        			List<Customer> list=impl.getAllCustomer();
			        			Iterator<Customer> i=list.iterator();
			        			while(i.hasNext()) 
			        			{
			        				System.out.println(i.next());
			        			}
			        			for(Customer c:list)
			        			{
			        				System.out.println(c);
			        			}
			        			break;
        			
		        		case 3:
			        			System.out.print("enter id to search");
				        		int id1=scanner.nextInt();
				        		impl.findById(id1);
				        		break;
        		
        		
		        		case 4:
			        			System.out.print("enter id to update");
							    int id11=scanner.nextInt();
							    impl.updateCustomer(id11);
							    break;
							    
		        		case 5:
			        			System.out.print("enter id to delete");
							    int id12=scanner.nextInt();
							    impl.deleteCustomer(id12);
							    break;
						default:
								System.out.print("invalid option");
							    
							   System.exit(0);
							   break;
		        			
        		
        		}
        		
        		
        	}while(choice!=0);
        }
        	
       
			/*
			 * System.out.print("ID: "); int id=scanner.nextInt();
			 * System.out.print("NAME: "); String name=scanner.next();
			 * System.out.print("EMAIL: "); String email=scanner.next();
			 * 
			 * CustomerFactory impl=new CustomerFactoryImpl(); Customer
			 * customer=impl.createCustomer(id, name, email);
			 * System.out.println(customer.toString());
			 */
        	//List<Customer> list=impl.getAllCustomer();
        	//System.out.print("Enter name to search");
        	//Scanner sc=new Scanner(System.in);
        	//String name=sc.next();
        	//impl.findByName(name);
        	
        			
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    
}
}
