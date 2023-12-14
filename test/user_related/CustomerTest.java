package user_related;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import support.Blacklist;
import support.Reason;

public class CustomerTest extends UserBaseTest {
	private Reason reason;

	@Before
	public void setUp() {
		user = new Customer("John", "Doe", "Storczykowa 23", "+48 274289374", "john@gmail.com", "johndoe", "password");
		reason = new Reason("Broken rules.");
	}

	@Test
	public void testGetID() {
		long previousID = Customer.getLastID();
		Customer newCustomer = new Customer("Jane", "Doe", "Kwiatkowa 7", "+48 987654321", "jane@example.com",
				"janedoe", "newpassword");

		assertEquals(previousID + 1, newCustomer.getCustomerID());
	}

	@Test
	public void testBlacklist() {
		Customer customer = new Customer("Anna", "Nowak", "Kwiatkowa 9", "+48 987457431", "anna@gmail.com", "annanowak",
				"password");
		customer.blacklist(reason);
		String result = Blacklist.showBlacklist();

		assertTrue(Blacklist.isCustomerBlacklisted(customer.getCustomerID()));
	}
}
