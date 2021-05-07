package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy kpsPublic=new KPSPublicSoapProxy();
		return kpsPublic.TCKimlikNoDogrula(
				Long.parseLong(customer.getNationalityId()), 
				customer.getFirstName().toUpperCase(), 
				customer.getLastName().toUpperCase(), 
				Integer.parseInt(customer.getDateOfBirth()));
	}
	
}
