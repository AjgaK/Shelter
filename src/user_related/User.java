package user_related;

public abstract class User {
	private String firstName;
	private String lastName;
	private String address;
	private String contactNumber;
	private String email;
	private String login;
	private String password;

	public User(String firstName, String lastName, String address, String contactNumber, String email, String login,
			String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contactNumber = contactNumber;
		this.email = email;
		this.login = login;
		this.password = password;
	}
}
