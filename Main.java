import java.util.*;

public class Main {
	public static void main(String[] args) {
		Customer customer;
		RegularCustomer regularCustomer = new RegularCustomer("taylor swift", 1000);
		SeniorCustomer seniorCustomer = new SeniorCustomer("charlie puth", 1000);

		customer = regularCustomer;
		System.out.println(customer.getName()+" " +customer.calculateBill());

		customer = seniorCustomer;
		System.out.println(customer.getName()+" "+customer.calculateBill());
	}
}
