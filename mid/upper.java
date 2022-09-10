import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class upper {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Give your name: ");
        String name = in.nextLine();

        System.out.println(name.toUpperCase());

    }

}
