import java.util.Scanner;

public class Area {

    public static void main(String[] Args) {

        Scanner Area = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int l = Area.nextInt();

        System.out.print("Enter the breadth: ");
        int b = Area.nextInt();

        int A = l * b;

        if (l == b) {
            System.out.println("This is a square and it's Area is: " + A);

        }

        else {
            System.out.println("This is a rectangle and it's Area is: " + A);
        }

    }
}