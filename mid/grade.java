
import java.util.Scanner;

public class grade {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your overall percentage: ");
        String G = in.nextLine();

        switch (G) {
            case "A":
                System.out.println("Well done!");
                break;

            case "B":
                System.out.println("Well done!");
                break;

            case "C":
                System.out.println("Well done!");
                break;

            case "D":
                System.out.println("So Close!");
                break;

            default:
                System.out.println("See you soon!");
        }

    }

}
