import java.util.Scanner;

public class read {

    public static void main(String[] args) {

        Scanner nums = new Scanner(System.in);

        System.out.println("ENter your nums: ");

        int num1, num2;

        num1 = nums.nextInt();
        num2 = nums.nextInt();

        System.out.println(num1 + " " + num2);

        System.out.println("Sum of given nums are: " + (num1 + num2));
        System.out.println("Differences are: " + (num1 - num2));

    }

}
