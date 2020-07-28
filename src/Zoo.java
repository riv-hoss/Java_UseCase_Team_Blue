import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {

    private String name;
    private String address;

    Zoo(String name, String address){
      this.name = name;
      this.address = address;

    }

    HashMap <Integer, String> users = new HashMap<>();

    ArrayList <Integer> animals = new ArrayList<>();


    public void addMembers(int userId, String userName){
        users.put(userId, userName);
        System.out.println("User " + userName + " are added to User List");
    }
    public void removeMember(int userId){
        users.remove(userId);
        System.out.println("User is removed");
    }

    public void printMembers(){

        for (int i : users.keySet()){
            System.out.println("Users of the Zoo " + name);
            System.out.println("User Id: " + i + "  User Name: " + users.get(i));
        }
    }


    public void addAnimals(int animalId){
        animals.add(animalId);
        System.out.print("ID " + animalId + "added to Animal List");
    }

    public void removeAnimal(int animalId){

        int id = animals.indexOf(animalId);
        animals.remove(id);
        System.out.println("Animal is removed from list");
    }

    public void printAnimal(){
        for (int i : animals) {
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
