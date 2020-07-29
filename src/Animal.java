import java.util.ArrayList;



public class Animal {
    private String name;
    private static int counter = 0;
    private int id;
    private int vetCount = 0;
    private int specialCareCount = 0;
    private String species;
    private String healthStatus;
    private ArrayList<VetHistory> vetHistory = new ArrayList<>();



    public Animal(String name, String species, String healthStatus) {
        this.name = name;
        this.species = species;
        this.healthStatus = healthStatus;
        this.id = ++counter;
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

    public ArrayList<VetHistory> getVetHistory() {
        return vetHistory;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public void setVetHistory(ArrayList<VetHistory> vetHistory) {
        this.vetHistory = vetHistory;
    }



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
