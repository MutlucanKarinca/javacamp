package ödev4gün.Concrete;

import ödev4gün.Abstract.CustomerCheckService;
import ödev4gün.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		
	}

}
