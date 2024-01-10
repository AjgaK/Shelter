package user_related;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import animal_related.Animal;

public class Employee extends User {
	protected static long lastID = 0;
	private long employeeID;
	private List<Animal> caredAnimals = new ArrayList<>();
	private List<Customer> monitoredCustomers = new ArrayList<>();

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

	public static long getLastID() {
		return lastID;
	}
}
