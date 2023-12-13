package user_related;

import org.junit.Before;

public class CustomerTest extends UserBaseTest {

	@Before
	public void setUp() {
		user = new Customer("John", "Doe", "Storczykowa 23", "+48 274289374", "john@gmail.com", "johndoe", "password");
	}
}
