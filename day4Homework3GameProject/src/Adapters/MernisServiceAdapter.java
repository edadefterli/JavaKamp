package Adapters;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean isRealPerson(User user) throws RemoteException {
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		try {
			return kpsPublic.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),
					user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(),Integer.parseInt(user.getDateofBirth()));
			 
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

}
