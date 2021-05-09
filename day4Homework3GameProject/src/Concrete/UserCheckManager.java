package Concrete;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean isRealPerson(User user) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}
