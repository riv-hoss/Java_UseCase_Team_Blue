import java.util.Scanner;

public class UserInterface {

    public void showMenu(Zoo zoo){

        String hLine = "\n+" + "-".repeat(31) + "+";
        String welcome = "\n|\t\t\t Welcome \t\t\t|";
        String toThe = "\n|\t\t\t to the \t\t\t|";
        String zName = "\n|\t\t\t %s \t\t\t|";
        System.out.printf(hLine + welcome + toThe + zName + hLine, zoo.getName());

        System.out.println("\nAnimal health request");
        System.out.println("1) Animals which are NOT healthy now");
        System.out.println("2) Animals in special care.");
        System.out.println("3) Number of Vet visits per animal species\n");
        System.out.println("ZOO Status requests");
        System.out.println("4) Animals per Species");
        System.out.println("5)Number of Vet Interventions");
        System.out.println("0) EXIT\n");

        System.out.println("Enter you choice: ");


        boolean stop = false;
        while (!stop) {
            Scanner scan = new Scanner(System.in);
            int inputMenu = scan.nextInt();
            switch (inputMenu) {
                case 0:
                    System.out.println("Thanks! BYE BYE!");
                    stop = true;
                    break;
                case 1:
                    int sickAnimals = 0;
                    for (Animal a : zoo.getAnimals().values()) {
                        if (a.getHealthStatus().equalsIgnoreCase("Sick")) {
                            sickAnimals++;
                        }
                    }
                    System.out.printf("%There are currently %d sick animals at the zoo.",
                            sickAnimals);
                    break;
                case 2:
                    int animalInCare = 0;
                    for (Animal a : zoo.getAnimals().values()) {
                        if (a.getHealthStatus().equalsIgnoreCase("inspecialcare")) {
                            animalInCare++;
                        }
                    }
                    System.out.printf("%There are currently %d animals in special care at the zoo.",
                            animalInCare);
                    break;
                case 3: // ____________________________________________ 1st nested switch ______________________________________________________
                    System.out.println("Display all species.\nPlease select species:\n   " +
                            "1) Cat\n   2) Lion\n   3) Coyote\n   4) Panda\n   5) Back to Main Menu\n\nEnter your choice:");
                    Scanner scan2 = new Scanner(System.in);
                    int speciesInputScanner2 = scan2.nextInt();
                    switch (speciesInputScanner2) {
                        case 1:
                            int catVetCountAllTime = 0;
                            for (Animal a : zoo.getAnimals().values()) {
                                if (a.getSpecies().equalsIgnoreCase("Cat")) {
                                    catVetCountAllTime += a.getVetCount();
                                }
                            }
                            System.out.printf("%nThe Vet was called %d times for species 'Cat' " +
                                    "since the beginning.  %n", catVetCountAllTime);
                            break;
                        case 2:
                            int lionVetCountAllTime = 0;
                            for (Animal a : zoo.getAnimals().values()) {
                                if (a.getSpecies().equalsIgnoreCase("Lion")) {
                                    lionVetCountAllTime += a.getVetCount();
                                }
                            }
                            System.out.printf("%nThe Vet was called %d times for species 'Lion' " +
                                    "since the beginning.  %n", lionVetCountAllTime);
                            break;
                        case 3:
                            int coyoteVetCountAllTime = 0;
                            for (Animal a : zoo.getAnimals().values()) {
                                if (a.getSpecies().equalsIgnoreCase("Coyote")) {
                                    coyoteVetCountAllTime += a.getVetCount();
                                }
                            }
                            System.out.printf("%nThe Vet was called %d times for species 'Coyote' " +
                                    "since the beginning.  %n", coyoteVetCountAllTime);
                            break;
                        case 4:
                            int pandaVetCountAllTime = 0;
                            for (Animal a : zoo.getAnimals().values()) {
                                if (a.getSpecies().equalsIgnoreCase("Panda")) {
                                    pandaVetCountAllTime += a.getVetCount();
                                }
                            }
                            System.out.printf("%nThe Vet was called %d times for species 'Panda' " +
                                    "since the beginning.  %n", pandaVetCountAllTime);
                            break;
                        case 5:
                            stop = true;
                            showMenu(zoo);
                            break;
                        default:
                            System.err.println("Enter a valid number from case 3!");
                    }
                    break;
                case 4:// __________________________________________________ 2nd nested switch ________________________________________________
                    System.out.println("Display all species.\nPlease select species:\n   " +
                            "1) Cat\n   2) Lion\n   3) Coyote\n   4) Panda\n   5) Back to Main Menu\n\nEnter your choice:");
                    Scanner scan3 = new Scanner(System.in);
                    int speciesInputScanner3 = scan3.nextInt();
                    switch (speciesInputScanner3) {
                        case 1:
                            int catCount = 0;
                            for (Animal a: zoo.getAnimals().values()) {
                                if (a.getSpecies().equalsIgnoreCase("Cat")) {
                                    catCount++;
                                }
                            }
                            System.out.printf("%nThere are %d of species 'Cat' in the zoo.  %n", catCount);
                            break;
                        case 2:
                            int lionCount = 0;
                            for (Animal a: zoo.getAnimals().values()) {
                                if (a.getSpecies().equalsIgnoreCase("Lion")) {
                                    lionCount++;
                                }
                            }
                            System.out.printf("%nThere are %d of species 'Lion' in the zoo.  %n", lionCount);
                            break;
                        case 3:
                            int coyoteCount = 0;
                            for (Animal a: zoo.getAnimals().values()) {
                                if (a.getSpecies().equalsIgnoreCase("Coyote")) {
                                    coyoteCount++;
                                }
                            }
                            System.out.printf("%nThere are %d of species 'Coyote' in the zoo.  %n", coyoteCount);
                            break;
                        case 4:
                            int pandaCount = 0;
                            for (Animal a: zoo.getAnimals().values()) {
                                if (a.getSpecies().equalsIgnoreCase("Panda")) {
                                    pandaCount++;
                                }
                            }
                            System.out.printf("%nThere are %d of species 'Panda' in the zoo.  %n", pandaCount);
                            break;
                        case 5:
                            stop = true;
                            showMenu(zoo);
                            break;
                        default:
                            System.out.println("Choose a valid number!");
                    }
                    break;
                case 5:
                    int vetTotalCount = 0;
                    for (Animal a : zoo.getAnimals().values()) {
                        vetTotalCount += a.getVetCount();
                    }
                    System.out.printf("%nThe vet was %d times at the zoo.  %n", vetTotalCount);
                    break;
                default:
                    System.err.println("Choose a valid number!");
                    stop= true;
                    showMenu(zoo);

            }
        }
    }



}
