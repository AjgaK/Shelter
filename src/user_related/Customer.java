package user_related;

import java.util.ArrayList;
import java.util.List;

import animal_related.Animal;
import support.Blacklist;
import support.Reason;

public class Customer extends User {
	protected static long lastID = 0;
	private long customerID;
	List<Animal> adoptedAnimals = new ArrayList<>();
	private Blacklist blacklist;
	private Employee monitoredBy;

	public Customer(String firstName, String lastName, String address, String contactNumber, String email, String login,
			String password) {
		super(firstName, lastName, address, contactNumber, email, login, password);
		this.customerID = ++lastID;
	}

	public void blacklist(Reason reason) {
		Blacklist blacklist = new Blacklist();
		blacklist.fillBlacklistFile(this, reason);
	}

	public void requestAdoption(Animal animal) {
		adoptedAnimals.add(animal);
		animal.editInformation(animal.getName(), animal.getDateOfBirth(), animal.getWeight(), animal.getSpecies(),
				animal.getBreed(), animal.getFoundDate(), animal.getSpecialNeedsList(), "Pending Adoption");
	}

	public long getCustomerID() {
		return customerID;
	}

	public List<Animal> getAdoptedAnimals() {
		return adoptedAnimals;
	}

	public static long getLastID() {
		return lastID;
	}
}
