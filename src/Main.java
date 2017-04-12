import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Learn your squares in cubes!");
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter an integer: ");
           // int userInput = Integer.parseInt(scan.nextLine());
            int userInput = scan.nextInt();
            scan.nextLine();

            System.out.println("Number      Squared     Cubed");
            System.out.println("======      =======     =====");

            for (int i = 1; i <= userInput; i++) {
                System.out.println(i + "            " + (i * i) + "             " + (i * i * i));
            }
            System.out.println("Do you want to continue? y/n");
            choice = scan.nextLine();
        }
        System.out.println("Bye!");
    }
}
