import java.text.DecimalFormat;

public class formatted {

    public static void main(String[] args) {
        String s;
        double a = 112233.44;

        System.out.println(a + " ");

        s = "0000.00";

        System.out.println(s + " " + a);

        DecimalFormat form = new DecimalFormat(s);
        System.out.println(s + " => " + form.format(a));

    }
}