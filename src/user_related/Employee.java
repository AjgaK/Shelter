package user_related;

import java.util.Random;

public class Employee extends User {
	protected static long lastID = 0;
	private long employeeID;

	public Employee(String firstName, String lastName, String address, String contactNumber, String email, String login,
			String password) {
		super(firstName, lastName, address, contactNumber, email, login, password);
		this.employeeID = ++lastID;
	}

	public void registerAccount() {
		String username = getFirstName() + getLastName() + employeeID;
		Random rand = new Random();
		int fiveDigitNumber = 10000 + rand.nextInt(90000);
		String password = "Shelter-" + fiveDigitNumber;
		setLogin(username);
		setPassword(password);
	}

	public long getEmployeeID() {
		return employeeID;
	}
}
