package �dev4g�n.Abstract;

import java.rmi.RemoteException;

import �dev4g�n.Entities.Customer;
 
public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer) throws Exception, RemoteException;
}
