package user_related;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest extends UserBaseTest {

	@Before
	public void setUp() {
		user = new Employee("John", "Doe", "Storczykowa 23", "+48 274289374", "john@gmail.com", "johndoe", "password");
	}

	@Test
	public void testRegisterAccount() {
		Employee employee = (Employee) user;
		employee.registerAccount();
		String generatedLogin = employee.getLogin();
		String generatedPassword = employee.getPassword();

		assertTrue(generatedLogin.equals("JohnDoe" + employee.getEmployeeID()));

		assertTrue(generatedPassword.startsWith("Shelter-"));
		assertTrue(generatedPassword.substring(8).matches("\\d{5}"));
	}
}
