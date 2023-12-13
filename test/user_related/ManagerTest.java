package user_related;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ManagerTest {
	private Manager manager;

	@Before
	public void setUp() {
		manager = new Manager("John", "Doe", "Storczykowa 23", "+48 274289374", "john@gmail.com", "johndoe",
				"password");
	}

	@Test
	public void testGetFirstName() {
		assertEquals("John", manager.getFirstName());
	}

	@Test
	public void testSetFirstName() {
		manager.setFirstName("Jane");
		assertEquals("Jane", manager.getFirstName());
	}

	@Test
	public void testGetLastName() {
		assertEquals("Doe", manager.getLastName());
	}

	@Test
	public void testSetLastName() {
		manager.setLastName("Smith");
		assertEquals("Smith", manager.getLastName());
	}

	@Test
	public void testGetAddress() {
		assertEquals("Storczykowa 23", manager.getAddress());
	}

	@Test
	public void testSetAddress() {
		manager.setAddress("Kwiatkowa 7");
		assertEquals("Kwiatkowa 7", manager.getAddress());
	}

	@Test
	public void testGetContactNumber() {
		assertEquals("+48 274289374", manager.getContactNumber());
	}

	@Test
	public void testSetContactNumber() {
		manager.setContactNumber("+48 123456789");
		assertEquals("+48 123456789", manager.getContactNumber());
	}

	@Test
	public void testGetEmail() {
		assertEquals("john@gmail.com", manager.getEmail());
	}

	@Test
	public void testSetEmail() {
		manager.setEmail("jane@wp.pl");
		assertEquals("jane@wp.pl", manager.getEmail());
	}

	@Test
	public void testGetLogin() {
		assertEquals("johndoe", manager.getLogin());
	}

	@Test
	public void testSetLogin() {
		manager.setLogin("janedoe");
		assertEquals("janedoe", manager.getLogin());
	}

	@Test
	public void testGetPassword() {
		assertEquals("password", manager.getPassword());
	}

	@Test
	public void testSetPassword() {
		manager.setPassword("newpassword");
		assertEquals("newpassword", manager.getPassword());
	}
}
