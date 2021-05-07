import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(1,"Edanur","Defterli","1999","12345678900");
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		try {
			customerManager.Save(customer);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
