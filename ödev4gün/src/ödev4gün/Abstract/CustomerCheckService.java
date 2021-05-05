package ödev4gün.Abstract;

import java.rmi.RemoteException;

import ödev4gün.Entities.Customer;
 
public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer) throws Exception, RemoteException;
}
