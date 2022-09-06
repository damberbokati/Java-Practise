import java.util.Scanner;

public class vowel {

    public static void main(String[] Args) {

        Scanner get = new Scanner(System.in);

        System.out.print("Enter any character: ");
        char ch = get.next().charAt(0);

        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
            System.out.println("It is a Vowel.");
        }

        else {
            System.out.println("It is not a Vowel.");
        }

    }

}
