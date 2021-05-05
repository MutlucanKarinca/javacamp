package �dev4g�n.Concrete;

import �dev4g�n.Abstract.BaseCustomerManager;
import �dev4g�n.Abstract.CustomerCheckService;
import �dev4g�n.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) throws Exception {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			throw new Exception("Not a valid person");
		}
		
	}
}
