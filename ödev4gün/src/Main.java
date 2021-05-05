import java.util.Date;

import Adapters.MernisServiceAdapter;
import ödev4gün.Abstract.BaseCustomerManager;
import ödev4gün.Concrete.NeroCustomerManager;
import ödev4gün.Concrete.StarbucksCustomerManager;
import ödev4gün.Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerManager=new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer
				(1,"Engin","Demiroð",new Date(1985,1,6),"28861499108"));
		
		
		
	}

}
