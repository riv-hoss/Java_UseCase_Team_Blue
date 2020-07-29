
public class Manager extends User {

	public Manager(String firstName, String lastName, String eMail, String address, String zip, String city, String phone) {
		super(firstName, lastName, eMail, address, zip, city, phone);
	}


	public void addEmployee(Zoo zoo, String firstName, String lastName, String eMail, String address, String zip, String city, String phone) {
		Employee user = new Employee(firstName, lastName, eMail, address, zip, city, phone);
		zoo.getUsersAsAdmin().put(user.getUserId(), user);
		System.out.println();
		System.out.println(this.getFullName() + " added Employee successfully to the users:");
		zoo.displaySpecificUser(user.getUserId());
	}

	public void removeEmployee(Zoo zoo, int employeeId) {
		try {
			if (!zoo.getUsers().containsKey(employeeId)) {
				System.out.println();
				throw new UserNotExistException("Employee " + employeeId + " does not exist!");
			}
			if (zoo.getUsers().get(employeeId) instanceof Manager) {
				System.out.println();
				System.out.println("Manager can not remove managers but only Employees!");
			} else {
				System.out.println();
				System.out.println("Employee " + employeeId + " will be removed!");
				zoo.displaySpecificUser(employeeId);
				System.out.println(this.getFullName() + " removed Employee " + employeeId + " successfully from the users!");
				zoo.getUsersAsAdmin().remove(employeeId);
			}
		} catch (UserNotExistException e) {
			System.out.println(e.getMessage());
		}
	}


	public void addAnimal(Animal animal) {

	}

	public void removeAnimal(int animalId) {

	}

	public void displayMedicationPerAnimal(int AnimalId) {
		//SUM Cost
	}

	public void displayMedicationPerSpecies(int AnimalId) {
		//SUM Cost
	}

	public void displayWeeklyStatusReports() {
		//mix of the above
	}

	//resourceManagement nice to have

}
