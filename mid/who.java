import java.util.Scanner;

public class who {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = in.nextLine();

        String s = (name.equals("Damber")) ? "Professor" : "Student";

        System.out.println(s);

    }

}
