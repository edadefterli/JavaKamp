package Concrete;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

}
