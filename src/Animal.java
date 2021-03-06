import java.util.ArrayList;
import java.util.HashMap;


public class Animal {
    private static int counter = 0;
    private int vetCounter = 0, specialCareCounter = 0;
    private int id;
    private String name;
    private int vetCount = 0;
    private int specialCareCount = 0;
    private boolean atTheVet;
    private boolean atSpecialCare;
    private String species;
    private String healthStatus;
    private ArrayList<String> vetHistory = new ArrayList<>();


    public Animal(String name, String species, String healthStatus, boolean atTheVet, boolean atSpecialCare) {
        this.name = name;
        this.species = species;
        this.healthStatus = healthStatus;
        this.atTheVet = atTheVet;
        this.atSpecialCare = atSpecialCare;
        this.id = ++counter;
    }


    public int VetCounter(){
        vetCount = vetCounter++;
        //System.out.println(vetCount);

       return vetCount;
    }


    Zoo d = new Zoo("d", "d");
    public void dd(){
        d.getAnimals();
        System.out.print(d.getUsers());
    }


    public int specialCareCounter(){
        specialCareCount = specialCareCounter++;
        //System.out.println(specialCareCount);
       return specialCareCount;
    }





    public double getMedicationCost() {

        return 0.0;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getVetCount() {
        return vetCount;
    }

    public String getSpecies() {
        return species;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public int getSpecialCareCount() {
        return specialCareCount;
    }

    public boolean isAtTheVet() {
        return atTheVet;
    }

    public boolean isAtSpecialCare() {
        return atSpecialCare;
    }

    /*public ArrayList<VetHistory> getVetHistory() {
        return vetHistory;
    }

     */


    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public void setSpecialCareCount(int specialCareCount) {
        this.specialCareCount = specialCareCount;
    }

    public void setAtTheVet(boolean atTheVet) {
        this.atTheVet = atTheVet;
    }

    public void setAtSpecialCare(boolean atSpecialCare) {
        this.atSpecialCare = atSpecialCare;
    }


    /*public void setVetHistory(ArrayList<VetHistory> vetHistory) {
        this.vetHistory = vetHistory;
    }

     */



    public void setVetCount(int vetCount) {
        this.vetCount = vetCount;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }



    
}
