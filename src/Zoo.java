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


    Scanner scan = new Scanner(System.in);
    Zoo(){
    menu();
    }
    public void menu(){
        System.out.println("Animal healthy request");
        System.out.println("1) Animals at the vet");
        System.out.println("2) Animals in special care.");
        System.out.println("3) At the Vet ranking for species\n");
        System.out.println("ZOO Status reyuests");
        System.out.println("4) Animals per Species");
        System.out.println("5)Number of Vet Interventions");
        System.out.println("6) Number of sick Animals since Zoo opening");
        System.out.println("7) Number of animals who needed special care since Zoo opening\n");
        System.out.println("Actions");
        System.out.println("8) Send to vet.");

        int inputMenu = scan.nextInt();

        switch (inputMenu) {
            case 1:
                System.out.println("1) Animals at the vet");
                break;
            case 2:
                System.out.println("2) Animals in special care.");
                break;
            case 3:
                System.out.println("3) At the Vet ranking for species\n");
                break;
            case 4:
                System.out.println("4) Animals per Species");
                break;
            case 5:
                System.out.println("5)Number of Vet Interventions");
                break;
            case 6:
                System.out.println("6) Number of sick Animals since Zoo opening");
                break;
            case 7:
                System.out.println("7) Number of animals who needed special care since Zoo opening\n");
                break;
            case 8:
                System.out.println("8) Send to vet.");
                break;
        }
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
