import java.util.ArrayList;



public class Animal {
    private String name;
    private static int counter = 0;
    private int id;
    private species species;
    private healthStatus healthStatus;
    private ArrayList<VetHistory> vetHistory = new ArrayList<>();



    public Animal(String name, species species, healthStatus healthStatus) {
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

    public species getSpecies() {
        return species;
    }

    public healthStatus getHealthStatus() {
        return healthStatus;
    }

    public ArrayList<VetHistory> getVetHistory() {
        return vetHistory;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(species species) {
        this.species = species;
    }

    public void setHealthStatus(healthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    public void setVetHistory(ArrayList<VetHistory> vetHistory) {
        this.vetHistory = vetHistory;
    }



    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    
}
