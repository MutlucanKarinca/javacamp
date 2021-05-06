package Adapters;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements UserCheckService{
	@Override
	public boolean CheckIfRealPerson(User user) {
		KPSPublicSoap client=new KPSPublicSoapProxy();
		
		boolean result = false;
		  try {
			  result = client.TCKimlikNoDogrula
					  (Long.parseLong(user.getNationalityId()), 
							  user.getFirstName(), 
							  user.getLastName(), 
							  user.getDateOfBirth().getYear());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	}
	
	
}
