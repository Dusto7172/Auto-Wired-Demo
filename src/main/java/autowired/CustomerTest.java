package autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Customer.xml");
		Customer cust = ctx.getBean(Customer.class);

		System.out.println(cust);
	}

}
