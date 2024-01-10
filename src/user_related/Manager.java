package user_related;

import java.util.ArrayList;
import java.util.List;

import animal_related.CareChecklist;

public class Manager extends Employee {
	private List<CareChecklist> createdChecklists = new ArrayList<>();
	private List<Customer> blacklistedCustomers = new ArrayList<>();

	public Manager(String firstName, String lastName, String address, String contactNumber, String email, String login,
			String password) {
		super(firstName, lastName, address, contactNumber, email, login, password);
	}

}
