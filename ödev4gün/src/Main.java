import java.util.Date;

import Adapters.MernisServiceAdapter;
import �dev4g�n.Abstract.BaseCustomerManager;
import �dev4g�n.Concrete.NeroCustomerManager;
import �dev4g�n.Concrete.StarbucksCustomerManager;
import �dev4g�n.Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerManager=new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer
				(1,"Engin","Demiro�",new Date(1985,1,6),"28861499108"));
		
		
		
	}

}
