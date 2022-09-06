/* 

//FOR LIGHTS 

enum color {
    GREEN, YELLOW, RED;
}

public class level {

    public static void main(String[] args) {

        System.out.println(color.RED);
    }

}

*/

//FOR FLAVORS 

import java.util.Scanner;

enum Flavor {
    VANILA, CHOCOLATE, STRAWBERRY;
}

public class level {

    public static void main(String[] args) {

        Flavor flav = Flavor.CHOCOLATE;

        if (flav == flav.VANILA) {
            System.out.println("It is Vanila.");
        } else if (flav == flav.CHOCOLATE) {
            System.out.println("It is Chocoolate.");
        } else {
            System.out.println("It is Strawberry.");
        }

    }
}