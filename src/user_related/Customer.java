package user_related;

import java.util.ArrayList;
import java.util.List;

import animal_related.Animal;

public class Customer extends User {
	protected static long lastID = 0;
	private long customerID;
	List<Animal> adoptedAnimals = new ArrayList<>();

	public Customer(String firstName, String lastName, String address, String contactNumber, String email, String login,
			String password) {
		super(firstName, lastName, address, contactNumber, email, login, password);
		this.customerID = ++lastID;
	}

}
