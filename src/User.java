public class User {
	private static int totalEmployees = 0;
	private final int userId;
	private String firstName, lastName, eMail, address, zip, city, phone;

	public User(String firstName, String lastName, String eMail, String address, String zip, String city, String phone) {
		this.userId = ++totalEmployees;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.address = address;
		this.zip = zip;
		this.city = city;
		this.phone = phone;
	}

	public int getUserId() {
		return userId;
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

	public String getFullName() {
		return firstName + " " + lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void sendAnimalToVet(Animal a) {
		a.setAtTheVet(true);
		a.setVetCount(a.getVetCount() + 1);

	}

	public void sendAnimalToSpecialCare(Animal a) {
		a.setAtSpecialCare(true);
		a.setSpecialCareCount(a.getSpecialCareCount() + 1);
	}

	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", eMail='" + eMail + '\'' +
				", address='" + address + '\'' +
				", zip='" + zip + '\'' +
				", city='" + city + '\'' +
				", phone='" + phone + '\'' +
				'}';
	}
}
