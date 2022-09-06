import java.util.Scanner;

public class weird {

    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);

        System.out.print("Enter any integer: ");
        int n = get.nextInt();

        if (n < 1 || n > 100 || n % 2 != 0) {
            System.out.println("Weird");
        }

        else if (n % 2 == 0 && 6 <= n && n <= 20) {
            System.out.println("Weird");
        }

        else if (n % 2 == 0 && 2 <= n && n <= 5 || n % 2 == 0 && n > 20) {
            System.out.println("Not Weird");

        }

    }
}