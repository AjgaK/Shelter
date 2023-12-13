package user_related;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest extends UserBaseTest {

	@Before
	public void setUp() {
		user = new Customer("John", "Doe", "Storczykowa 23", "+48 274289374", "john@gmail.com", "johndoe", "password");
	}

	@Test
	public void testGetID() {
		long previousID = Customer.getLastID();
		Customer newCustomer = new Customer("Jane", "Doe", "Kwiatkowa 7", "+48 987654321", "jane@example.com",
				"janedoe", "newpassword");

		assertEquals(previousID + 1, newCustomer.getCustomerID());
	}
}
