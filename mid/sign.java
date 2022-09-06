import java.util.Scanner;

public class sign {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = in.nextInt();

        System.out.print("Enter B: ");
        int b = in.nextInt();

        int sign = (a > b) ? 1 : (a < b) ? -1 : 0;
        System.out.println(sign);
    }

}
