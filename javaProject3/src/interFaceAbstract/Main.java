package interFaceAbstract;

import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Adaptors.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Customer enes = new Customer(1,"Enes Furkan","Aras",new GregorianCalendar(1998, 05, 04).getTime(),"55666666");

		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(enes);
		
		
	}

}