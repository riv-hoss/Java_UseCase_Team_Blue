public class Main {

    public static void main(String[] args) {
	// write your code here


        Zoo myZoo = new Zoo("CrazyZoo", "Vienna");

        Manager user001 = new Manager("John", "Doe", "john@mail.xx", "Street 15", "45585", "Taiwan", "+5584646457");
        myZoo.addManagerAsObject(user001);


        myZoo.addManager("Jane", "Doe", "jane@mail.xx", "Street 15", "5446", "Taiwan", "+5756456");



        user001.setFirstName("Snoopy");

        for (int i : myZoo.getUsers().keySet()) {
            System.out.println(myZoo.getUsers().get(i));
        }


    }
}
