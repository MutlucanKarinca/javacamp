package Adapters;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import �dev4g�n.Abstract.CustomerCheckService;
import �dev4g�n.Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap client=new KPSPublicSoapProxy();
		
		boolean result = false;
		  try {
			  result = client.TCKimlikNoDogrula
					  (Long.parseLong(customer.getNationalityId()), 
							  customer.getFirstName(), 
							  customer.getLastName(), 
							  customer.getDateOfBirth().getYear());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	}

}
