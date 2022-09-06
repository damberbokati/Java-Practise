import java.util.Scanner;

public class consule {

    public static void main(String[] args) {

        int a = 21;

        System.console().printf("Your num is: %d\n", a);

        Scanner name = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String str = name.nextLine();

        System.out.printf("Age of %s is %d", str, a);

        // System.console().printf("Age of %s is %d", str, a);

    }
}