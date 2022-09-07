import java.util.Arrays;

public class Roll {

    public static void main(String[] args) {

        String ls = System.lineSeparator();

        if (args.length != 2) {
            System.err.println("Errorrrr!!!");
            System.exit(-1);
        }

        int numSides = Integer.parseInt(args[1]);
        int numDice = Integer.parseInt(args[0]);
        int dice[] = new int[numDice];

        for (int i = 0; i < numDice; ++i)
            dice[i] = 1 + (int) (numSides * Math.random());
        Arrays.sort(dice);

        int sum = 0;

        for (int d : dice) {
            System.out.println(" " + d);
            sum += d;
        }

        System.out.println(ls + " Sum =" + sum);
        System.out.println(" Average=" + ((double) sum / (double) numDice));

    }

}
