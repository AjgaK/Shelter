package user_related;

import org.junit.Before;

public class UserTest extends UserBaseTest {

	@Before
	public void setUp() {
		user = new TestableUser("John", "Doe", "Storczykowa 23", "+48 274289374", "john@gmail.com", "johndoe",
				"password");
	}
}
