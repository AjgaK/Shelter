package user_related;

public class ManagerTest extends UserBaseTest {

	@Override
	public void setUp() {
		user = new Manager("John", "Doe", "Storczykowa 23", "+48 274289374", "john@gmail.com", "johndoe", "password");
	}

}
