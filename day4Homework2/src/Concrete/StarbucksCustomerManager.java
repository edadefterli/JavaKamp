package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager{
	private CustomerCheckService _customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this._customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer)  throws Exception{
		
		if(_customerCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			throw new Exception("Not a valid person");
		}
		
	}
	
	
}
