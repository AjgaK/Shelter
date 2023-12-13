package user_related;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	private Employee employee;

	@Before
	public void setUp() {
		employee = new Employee("John", "Doe", "Storczykowa 23", "+48 274289374", "john@gmail.com", "johndoe",
				"password");
	}

	@Test
	public void testGetFirstName() {
		assertEquals("John", employee.getFirstName());
	}

	@Test
	public void testSetFirstName() {
		employee.setFirstName("Jane");
		assertEquals("Jane", employee.getFirstName());
	}

	@Test
	public void testGetLastName() {
		assertEquals("Doe", employee.getLastName());
	}

	@Test
	public void testSetLastName() {
		employee.setLastName("Smith");
		assertEquals("Smith", employee.getLastName());
	}

	@Test
	public void testGetAddress() {
		assertEquals("Storczykowa 23", employee.getAddress());
	}

	@Test
	public void testSetAddress() {
		employee.setAddress("Kwiatkowa 7");
		assertEquals("Kwiatkowa 7", employee.getAddress());
	}

	@Test
	public void testGetContactNumber() {
		assertEquals("+48 274289374", employee.getContactNumber());
	}

	@Test
	public void testSetContactNumber() {
		employee.setContactNumber("+48 123456789");
		assertEquals("+48 123456789", employee.getContactNumber());
	}

	@Test
	public void testGetEmail() {
		assertEquals("john@gmail.com", employee.getEmail());
	}

	@Test
	public void testSetEmail() {
		employee.setEmail("jane@wp.pl");
		assertEquals("jane@wp.pl", employee.getEmail());
	}

	@Test
	public void testGetLogin() {
		assertEquals("johndoe", employee.getLogin());
	}

	@Test
	public void testSetLogin() {
		employee.setLogin("janedoe");
		assertEquals("janedoe", employee.getLogin());
	}

	@Test
	public void testGetPassword() {
		assertEquals("password", employee.getPassword());
	}

	@Test
	public void testSetPassword() {
		employee.setPassword("newpassword");
		assertEquals("newpassword", employee.getPassword());
	}
}
