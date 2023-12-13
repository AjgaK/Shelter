package user_related;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public abstract class UserBaseTest {
	protected User user;

	@Before
	public abstract void setUp();

	@Test
	public void testGetFirstName() {
		assertEquals("John", user.getFirstName());
	}

	@Test
	public void testSetFirstName() {
		user.setFirstName("Jane");
		assertEquals("Jane", user.getFirstName());
	}

	@Test
	public void testGetLastName() {
		assertEquals("Doe", user.getLastName());
	}

	@Test
	public void testSetLastName() {
		user.setLastName("Smith");
		assertEquals("Smith", user.getLastName());
	}

	@Test
	public void testGetAddress() {
		assertEquals("Storczykowa 23", user.getAddress());
	}

	@Test
	public void testSetAddress() {
		user.setAddress("Kwiatkowa 7");
		assertEquals("Kwiatkowa 7", user.getAddress());
	}

	@Test
	public void testGetContactNumber() {
		assertEquals("+48 274289374", user.getContactNumber());
	}

	@Test
	public void testSetContactNumber() {
		user.setContactNumber("+48 123456789");
		assertEquals("+48 123456789", user.getContactNumber());
	}

	@Test
	public void testGetEmail() {
		assertEquals("john@gmail.com", user.getEmail());
	}

	@Test
	public void testSetEmail() {
		user.setEmail("jane@wp.pl");
		assertEquals("jane@wp.pl", user.getEmail());
	}

	@Test
	public void testGetLogin() {
		assertEquals("johndoe", user.getLogin());
	}

	@Test
	public void testSetLogin() {
		user.setLogin("janedoe");
		assertEquals("janedoe", user.getLogin());
	}

	@Test
	public void testGetPassword() {
		assertEquals("password", user.getPassword());
	}

	@Test
	public void testSetPassword() {
		user.setPassword("newpassword");
		assertEquals("newpassword", user.getPassword());
	}

	@Test
	public void testChangeLoginCredentials() {
		user.changeLoginCredentials("newjohndoe", "newpassword");
		assertEquals("newjohndoe", user.getLogin());
		assertEquals("newpassword", user.getPassword());
	}

	@Test
	public void testRecoverAccountWithCorrectEmail() {
		user.recoverAccount("john@gmail.com");
		assertEquals("defaultPassword", user.getPassword());
	}

	@Test
	public void testRecoverAccountWithIncorrectEmail() {
		String originalPassword = user.getPassword();
		user.recoverAccount("wrong@example.com");
		assertEquals(originalPassword, user.getPassword());
	}
}
