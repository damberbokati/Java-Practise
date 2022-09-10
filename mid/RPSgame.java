import java.util.Random;
import java.util.Scanner;

public class RPSgame {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("\nChoose 0 for Rock, 1 for Paper or 2 for Seasor: ");
        int num = in.nextInt();

        Random ramdom = new Random();

        int comp = ramdom.nextInt(3);

        if (num == comp) {
            System.out.println("\nIt's a Draw!!!");
        }

        else if ((num == 0 & comp == 2) || (num == 1 & comp == 0) || (num == 2 & comp == 1)) {
            System.out.println("\nYou win!!!");
        }

        else {
            System.out.println("\nCOmputer won the game! HAHA!!\n");
        }

        if (comp == 0) {
            System.out.println("The Computer choose ROck\n");
        } else if (comp == 1) {
            System.out.println("The Computer choose PAper\n");
        } else {
            System.out.println("The Computer choose Seasor\n");
        }

    }

}
