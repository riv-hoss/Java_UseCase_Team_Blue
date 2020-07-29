import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Zoo {

	private String name;
	private String address;

	Zoo(String name, String address) {
		this.name = name;
		this.address = address;

	}


	HashMap<Integer, User> users = new HashMap<>();
	HashMap<Integer, Animal> animals = new HashMap<>();
	String displayUserPattern = "%-20s%-20s%-20s%-25s%-9s%-15s%-15s%-10s%5s%n";

	public HashMap<Integer, User> getUsers() {
		return new HashMap<>(users);
	}

	public HashMap<Integer, User> getUsersAsAdmin(int userId) {
		try {
			if (!users.containsKey(userId)) {
				throw new UserNotExistException("Employee " + userId + " does not exist!");
			}
			for (int i : users.keySet()) {
				if (users.get(userId) instanceof Manager) {
					return users;
				} else {
					System.out.println();
					System.out.println("Only Managers can access Users as Admin!");
					return null;
				}
			}
			return new HashMap<>(users);
		} catch (UserNotExistException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public HashMap<Integer, Animal> getAnimals() {
		return new HashMap<>(animals);
	}

	public HashMap<Integer, Manager> getManagers(){
		HashMap<Integer, Manager> managers = new HashMap<>();
		for(int i : users.keySet()){
			if(users.get(i) instanceof Manager){
				managers.put(users.get(i).getUserId(), (Manager)users.get(i));
			}
		}
		return managers;
	}

	public HashMap<Integer, Employee> getEmployees(){
		HashMap<Integer, Employee> employees = new HashMap<>();
		for(int i : users.keySet()){
			if(users.get(i) instanceof Employee){
				employees.put(users.get(i).getUserId(), (Employee)users.get(i));
			}
		}
		return employees;
	}

	public void addManager(String firstName, String lastName, String eMail, String address, String zip, String city, String phone) {
		Manager user = new Manager(firstName, lastName, eMail, address, zip, city, phone);
		users.put(user.getUserId(), user);
		System.out.println();
		System.out.println("Manager successfully added to the users:");
		displaySpecificUser(user.getUserId());
	}

	public void addEmployee(String firstName, String lastName, String eMail, String address, String zip, String city, String phone) {
		Employee user = new Employee(firstName, lastName, eMail, address, zip, city, phone);
		users.put(user.getUserId(), user);
		System.out.println();
		System.out.println("Employee successfully added to the users:");
		displaySpecificUser(user.getUserId());
	}

	public void addManagerAsObject(User user) {
		users.put(user.getUserId(), user);
		System.out.println();
		System.out.println("Manager successfully added to the users:");
		displaySpecificUser(user.getUserId());
	}

	public void addEmployeeAsObject(User user) {
		users.put(user.getUserId(), user);
		System.out.println();
		System.out.println("Employee successfully added to the users:");
		displaySpecificUser(user.getUserId());
	}

	public void displayAllUsers() {
		String type = "";
		System.out.println("\nPrinting all Users: ");
		System.out.printf(displayUserPattern, "FIRSTNAME", "LASTNAME", "EMAIL", "ADDRESS", "ZIP", "CITY", "PHONE", "TYPE", "ID");
		for (int i : users.keySet()) {
			if (users.get(i) instanceof Manager) {
				type = "Manager";
			}
			if (users.get(i) instanceof Employee) {
				type = "Employee";
			}
			System.out.printf(displayUserPattern, users.get(i).getFirstName(), users.get(i).getLastName(), users.get(i).geteMail(), users.get(i).getAddress(), users.get(i).getZip(), users.get(i).getCity(), users.get(i).getPhone(), type, users.get(i).getUserId());
		}
	}

	public void displayAllManagers() {
		String type;
		System.out.println("\nPrinting all Managers: ");
		System.out.printf(displayUserPattern, "FIRSTNAME", "LASTNAME", "EMAIL", "ADDRESS", "ZIP", "CITY", "PHONE", "TYPE", "ID");
		for (int i : getManagers().keySet()) {
			type = "Manager";
			System.out.printf(displayUserPattern, users.get(i).getFirstName(), users.get(i).getLastName(), users.get(i).geteMail(), users.get(i).getAddress(), users.get(i).getZip(), users.get(i).getCity(), users.get(i).getPhone(), type, users.get(i).getUserId());
		}
	}

	public void displayAllEmployees() {
		String type;
		System.out.println("\nPrinting all Employees: ");
		System.out.printf(displayUserPattern, "FIRSTNAME", "LASTNAME", "EMAIL", "ADDRESS", "ZIP", "CITY", "PHONE", "TYPE", "ID");
		for (int i : getEmployees().keySet()) {
			type = "Employee";
			System.out.printf(displayUserPattern, users.get(i).getFirstName(), users.get(i).getLastName(), users.get(i).geteMail(), users.get(i).getAddress(), users.get(i).getZip(), users.get(i).getCity(), users.get(i).getPhone(), type, users.get(i).getUserId());
		}
	}

	public void displaySpecificUser(int i) {
		try {
			if (!users.containsKey(i)) {
				throw new UserNotExistException("User Id does not exist!");
			}
			String type = "";
			System.out.printf(displayUserPattern, "FIRSTNAME", "LASTNAME", "EMAIL", "ADDRESS", "ZIP", "CITY", "PHONE", "TYPE", "ID");
			if (users.get(i) instanceof Manager) {
				type = "Manager";
			}
			if (users.get(i) instanceof Employee) {
				type = "Employee";
			}
			System.out.printf(displayUserPattern, users.get(i).getFirstName(), users.get(i).getLastName(), users.get(i).geteMail(), users.get(i).getAddress(), users.get(i).getZip(), users.get(i).getCity(), users.get(i).getPhone(), type, users.get(i).getUserId());
		} catch (UserNotExistException e) {
			System.out.println(e.getMessage());
		}
	}










	//	public void removeMember(int userId) {
//		users.remove(userId);
//		System.out.println("User is removed");
//	}
//
	//	public void printMembers() {

//        for (User i : users.keySet()){
//            System.out.println("Users of the Zoo " + name);
//            System.out.println("User Id: " + i + "  User Name: " + users.get(i));
//        }
//    }


//    public void addAnimals(Animal animal){
//        animals.add(animal);
//        System.out.print("ID " + animal.getName() + "added to Animal List");
//    }
//
//    public void removeAnimal(int animalId){
//
//        int id = animals.indexOf(animalId);
//        animals.remove(id);
//        System.out.println("Animal is removed from list");
//    }


//		public void printAnimal () {
//			for (Animal i : animals) {
//
//				System.out.println("Animal Id: " + i);
//			}
//		}

//    public String getName() {
//        return name;
//    }

//		public void setName (String name){
//			this.name = name;
//		}

//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }


}
