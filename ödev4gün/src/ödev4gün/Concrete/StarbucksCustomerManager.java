package ödev4gün.Concrete;

import ödev4gün.Abstract.BaseCustomerManager;
import ödev4gün.Abstract.CustomerCheckService;
import ödev4gün.Entities.Customer;

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
