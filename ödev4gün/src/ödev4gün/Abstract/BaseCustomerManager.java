package �dev4g�n.Abstract;

import �dev4g�n.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void Save(Customer customer) throws Exception {
		System.out.println("Saved to db  : "+customer.getFirstName());
		
	}

}
