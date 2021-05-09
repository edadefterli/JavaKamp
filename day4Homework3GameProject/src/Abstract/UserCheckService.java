package Abstract;

import java.rmi.RemoteException;

import Entities.User;

public interface UserCheckService {
	
	boolean isRealPerson(User user) throws RemoteException;

}
