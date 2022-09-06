import java.util.Scanner;

public class input {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: "); // get string
        String a = in.nextLine(); // we can use next() or nextLine()

        System.out.print("Enter Age: "); // get integer
        int b = in.nextInt();

        System.out.print("Enter double num: "); // get double num
        double c = in.nextDouble();

        System.out.println("Your name is: " + a); // print string
        System.out.println("Your age: " + b); // print int
        System.out.println("Double num is: " + c); // print double
        System.out.println("Muntiply double is: " + c * 2); // multiply double

        int x = a.length();
        System.out.printf("LEngth of string is: %d%n ", x);

    }
}