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

	public void changeLoginCredentials(String newLogin, String newPassword) {
		this.login = newLogin;
		this.password = newPassword;
	}

	public void recoverAccount(String email) {
		if (this.email.equals(email)) {
			this.password = "defaultPassword";
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
