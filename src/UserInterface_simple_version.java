import java.util.Scanner;

public class UserInterface_simple_version {


    public void showMenu(Zoo zoo){

        String hLine = "\n+" + "-".repeat(31) + "+";
        String welcome = "\n|\t\t\t Welcome \t\t\t|";
        String toThe = "\n|\t\t\t to the \t\t\t|";
        String zName = "\n|\t\t\t %s \t\t\t|";
        System.out.printf(hLine + welcome + toThe + zName + hLine, zoo.getName());



        boolean stop = false;
        while (!stop) {
            System.out.println("\nAnimal health request");
            System.out.println("1) Animals which are NOT healthy now");
            System.out.println("2) Animals in special care.");
            System.out.println("3) Number of Vet visits per animal species\n");
            System.out.println("ZOO Status requests");
            System.out.println("4) Animals per Species");
            System.out.println("5)Number of Vet Interventions");
            System.out.println("0) EXIT\n");

            System.out.println("Enter you choice: ");
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
                case 3:
                    int catVetCountAllTime = 0;
                    int lionVetCountAllTime = 0;
                    int coyoteVetCountAllTime = 0;
                    int pandaVetCountAllTime = 0;
                    for (Animal a : zoo.getAnimals().values()) {
                        if (a.getSpecies().equalsIgnoreCase("Cat")) {
                            catVetCountAllTime += a.getVetCount();

                        } else if (a.getSpecies().equalsIgnoreCase("Lion")) {
                            lionVetCountAllTime += a.getVetCount();

                        } else if (a.getSpecies().equalsIgnoreCase("Coyote")) {
                            coyoteVetCountAllTime += a.getVetCount();

                        } else {
                            pandaVetCountAllTime += a.getVetCount();

                        }
                    }
                    System.out.printf("%nThe Vet was called %d times for species 'Cat' " +
                            "since the beginning.  %n", catVetCountAllTime);
                    System.out.printf("%nThe Vet was called %d times for species 'Lion' " +
                            "since the beginning.  %n", lionVetCountAllTime);
                    System.out.printf("%nThe Vet was called %d times for species 'Cat' " +
                            "since the beginning.  %n", coyoteVetCountAllTime);
                    System.out.printf("%nThe Vet was called %d times for species 'Cat' " +
                            "since the beginning.  %n", pandaVetCountAllTime);


                    break;
                case 4:
                    int catCount = 0;
                    int lionCount = 0;
                    int coyoteCount = 0;
                    int pandaCount = 0;
                    for (Animal a: zoo.getAnimals().values()) {
                        if (a.getSpecies().equalsIgnoreCase("Cat")) {
                            catCount++;

                        } else if (a.getSpecies().equalsIgnoreCase("Lion")) {
                            lionCount++;


                        } else if (a.getSpecies().equalsIgnoreCase("Coyote")) {
                            coyoteCount++;

                        } else {
                            pandaCount++;

                        }
                    }
                    System.out.printf("%nThere are %d of species 'Cat' in the zoo.  %n", catCount);
                    System.out.printf("%nThere are %d of species 'Cat' in the zoo.  %n", lionCount);
                    System.out.printf("%nThere are %d of species 'Cat' in the zoo.  %n", coyoteCount);
                    System.out.printf("%nThere are %d of species 'Cat' in the zoo.  %n", pandaCount);
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
                    //showMenu(zoo);

            }
        }
    }



}

