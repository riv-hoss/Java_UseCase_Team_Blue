public class User {
	private static int totalEmployees = 0;
	private int userId;
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

	public static int getTotalEmployees() {
		return totalEmployees;
	}

	public static void setTotalEmployees(int totalEmployees) {
		User.totalEmployees = totalEmployees;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public void displayCurrentlySickAnimals() {
		//plus SUM
	}

	public void displayCurrentlyInCareAnimals() {
		//plus SUM
	}

	public void displaySumOfVetVisitsEver() {

	}

	public void displaySumOfSickAnimalsEver() {

	}

	public void displaySumOfSpecialCareAnimalsEver() {

	}

	public void displayVetHistoryPerAnimal() {

	}

	public void displayVetHistoryPerSpecies() {

	}

	public void displaySumOfVetVisitsPerSAnimal() {

	}

	public void displaySumOfVetVisitsPerSpecies() {

	}

	public void sendAnimalToVet() {

	}

	public void sendAnimalToSpecialCare() {

	}

	public void receiveAnimalBack() {

	}

	public void displaySumOfTotalAnimals() {

	}

	public void displaySumOfAnimalsPerSpecies() {

	}



}
