package user_related;

public class Employee extends User {
	protected static long lastID = 0;
	private long employeeID;

	public Employee(String firstName, String lastName, String address, String contactNumber, String email, String login,
			String password) {
		super(firstName, lastName, address, contactNumber, email, login, password);
		this.employeeID = ++lastID;
	}

}
