package org.customer.app.factory;
import java.util.List;

import org.customer.module.customer;


public class CustomerFactoryImpl implements CustomerFactory{
	
	private Connection connection=null;
	
	public CustomerFactoryImpl() {
		super();
		connection=MyHbSql
	}
	
}
public interface CustomerFactory {
	
	public customer createCustomer(int id,String name,String email);
	public List<customer> getAllCustomer();
	

}

