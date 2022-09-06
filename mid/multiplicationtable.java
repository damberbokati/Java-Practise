import java.util.Scanner;

import javax.xml.transform.Source;

public class multiplicationtable {

    public static void main(String[] args) {

        /*
         * Table of single inserted number||
         * 
         * Scanner in = new Scanner(System.in);
         * 
         * System.out.print("Enter the num you want a table of: ");
         * int num = in.nextInt();
         * 
         * for (int i = 1; i <= 12; i++) {
         * int table = num * i;
         * 
         * System.console().printf("%d\n", table);
         * }
         * 
         */

        System.out.printf("\n\n%25s Times 12 Table\n\n", " ");

        System.out.println("     ");

        for (int i = 0; i <= 12; ++i) {
            System.console().printf("%4d ", i);
        }

        System.out.printf("\n");

        for (int i = 0; i <= 12; ++i) {
            System.out.printf("---- ", i);
        }

        for (int j = 0; j <= 12; ++j) {
            System.out.printf("\n%2d | ", j);

            for (int i = 0; i <= 12; ++i) {
                System.out.printf("%4d", i * j);
            }
        }
        System.out.println();

    }

}
