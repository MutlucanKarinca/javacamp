package �dev4g�n.Concrete;

import �dev4g�n.Abstract.CustomerCheckService;
import �dev4g�n.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		
	}

}
