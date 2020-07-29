import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Zoo {

    private String name;
    private String address;

    Zoo(String name, String address){
      this.name = name;
      this.address = address;

    }


    HashMap <User, User> users = new HashMap<>();

    ArrayList <Animal> animals = new ArrayList<Animal>();



    public void addMembers(User userId, User userName){
        users.put(userId, userName);
        System.out.println("User " + userName + " are added to User List");
    }




    public void removeMember(int userId){
        users.remove(userId);
        System.out.println("User is removed");
    }

    public void printMembers(){

        for (User i : users.keySet()){
            System.out.println("Users of the Zoo " + name);
            System.out.println("User Id: " + i + "  User Name: " + users.get(i));
        }
    }


    public void addAnimals(Animal animal){
        animals.add(animal);
        System.out.print("ID " + animal.getName() + "added to Animal List");
    }

    public void removeAnimal(int animalId){

        int id = animals.indexOf(animalId);
        animals.remove(id);
        System.out.println("Animal is removed from list");
    }


    public void printAnimal(){
        for (Animal i : animals) {

            System.out.println("Animal Id: " + i);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
