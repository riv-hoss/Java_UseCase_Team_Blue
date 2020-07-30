import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {
        // write your code here

        Zoo myZoo = new Zoo("CrazyZoo", "Vienna");


        Manager manager001 = new Manager("John", "Doe", "john@mail.xx", "Street 15", "45585", "Taiwan", "+5584646457");
        myZoo.addManagerAsObject(manager001);

        Employee employee001 = new Employee("Jane", "Doe", "jane@mail.xx", "Street 15", "5446", "Taiwan", "+46466466");
        myZoo.addEmployeeAsObject(employee001);

        myZoo.displayAllManagers();
        myZoo.displayAllEmployees();
        myZoo.displayAllUsers();

        myZoo.addManager("Philip", "Curry", "philip@mail.xx", "Street 69", "56456", "HongKong", "+564666546");

        //add Employee by Manager
        manager001.addEmployee(myZoo, "Dalton","Alvarez", "dalton@mail.yy", "Dalton Street 12", "65461", "Moscow", "+45165463");
        //add Employee by Manager
        myZoo.getManagers().get(1).addEmployee(myZoo, "Colby","Castaneda", "olby@mail.yy", "Castaneda Street 442", "9884", "Mumbai", "+56444646");

//        will not work because "addEmployee" only exists for managers
//        myZoo.getUsers().get(1).addEmployee(myZoo, "Colby","Castaneda", "olby@mail.yy", "Castaneda Street 442", "9884", "Mumbai", "+56444646");


        //remove Manager by Manager will not work
        manager001.removeEmployee(myZoo, 1);
        //remove Employee by Manager
        manager001.removeEmployee(myZoo, 4);
        //Throw user not exist Exception for Employee
        manager001.removeEmployee(myZoo, 972);
        myZoo.displayAllUsers();


        // add dummy animal data
        myZoo.addAnimal("Fjodor", "Coyote", "Sick", true, false);
        myZoo.addAnimal("Iwan", "Coyote", "Healthy", false, true);
        myZoo.addAnimal("Andrej", "Coyote", "Healthy", false, false);
        myZoo.addAnimal("An Tri", "Panda", "Sick", true, true);
        myZoo.addAnimal("Anjing", "Panda", "Healthy", false, false);
        myZoo.addAnimal("Baihu", "Panda", "Healthy", false, false);
        myZoo.addAnimal("Bailong", "Panda", "Healthy", false, true);
        myZoo.addAnimal("Hagen", "Lion", "Healthy", false, false);
        myZoo.addAnimal("Siegfried", "Lion", "Sick", true, false);
        myZoo.addAnimal("Kriemhild", "Lion", "Healthy", false, false);
        myZoo.addAnimal("Etzel", "Lion", "Healthy", false, false);
        myZoo.addAnimal("Alberich", "Loin", "Healthy", false, true);
        myZoo.addAnimal("Recha", "Cat",  "Healthy", false, false);
        myZoo.addAnimal("Sittah", "Cat", "Sick", false, true);
        myZoo.addAnimal("Nathan", "Cat", "Healthy", false, false);
        myZoo.addAnimal("Patriarch", "Cat", "Sick", true, false);
        myZoo.addAnimal("Trump", "Coyote", "Sick", true, true);
        myZoo.addAnimal("Kennedy", "Cat", "Healthy", false, true);
        myZoo.addAnimal("Roosevelt", "Lion", "Sick", true, false);
        myZoo.addAnimal("Howard Taft", "Panda", "Healthy", false, false);
        myZoo.addAnimal("James A Garfield", "Cat", "Sick", false, true);


        UserInterface_simple_version myMenu = new UserInterface_simple_version();
        myMenu.showMenu(myZoo);










    }
}
