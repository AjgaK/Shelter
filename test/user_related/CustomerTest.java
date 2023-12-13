package user_related;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
	private Customer customer;

	@Before
	public void setUp() {
		customer = new Customer("John", "Doe", "Storczykowa 23", "+48 274289374", "john@gmail.com", "johndoe",
				"password");
	}

	@Test
	public void testGetFirstName() {
		assertEquals("John", customer.getFirstName());
	}

	@Test
	public void testSetFirstName() {
		customer.setFirstName("Jane");
		assertEquals("Jane", customer.getFirstName());
	}

	@Test
	public void testGetLastName() {
		assertEquals("Doe", customer.getLastName());
	}

	@Test
	public void testSetLastName() {
		customer.setLastName("Smith");
		assertEquals("Smith", customer.getLastName());
	}

	@Test
	public void testGetAddress() {
		assertEquals("Storczykowa 23", customer.getAddress());
	}

	@Test
	public void testSetAddress() {
		customer.setAddress("Kwiatkowa 7");
		assertEquals("Kwiatkowa 7", customer.getAddress());
	}

	@Test
	public void testGetContactNumber() {
		assertEquals("+48 274289374", customer.getContactNumber());
	}

	@Test
	public void testSetContactNumber() {
		customer.setContactNumber("+48 123456789");
		assertEquals("+48 123456789", customer.getContactNumber());
	}

	@Test
	public void testGetEmail() {
		assertEquals("john@gmail.com", customer.getEmail());
	}

	@Test
	public void testSetEmail() {
		customer.setEmail("jane@wp.pl");
		assertEquals("jane@wp.pl", customer.getEmail());
	}

	@Test
	public void testGetLogin() {
		assertEquals("johndoe", customer.getLogin());
	}

	@Test
	public void testSetLogin() {
		customer.setLogin("janedoe");
		assertEquals("janedoe", customer.getLogin());
	}

	@Test
	public void testGetPassword() {
		assertEquals("password", customer.getPassword());
	}

	@Test
	public void testSetPassword() {
		customer.setPassword("newpassword");
		assertEquals("newpassword", customer.getPassword());
	}
}
