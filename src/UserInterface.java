import java.util.Scanner;

public class UserInterface {


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
                System.out.println("3) At the Vet ranking for species");
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
                System.out.println("7) Number of animals who needed special care since Zoo opening");
                break;
            case 8:
                System.out.println("8) Send to vet.");
                break;
        }
    }


}
