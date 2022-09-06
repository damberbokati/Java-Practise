public class equal {

    public static void main(String[] args) {

        Integer a = 0;
        Integer b = 0;

        Integer c = 1000;
        Integer d = 1000;

        if (a == b)
            System.out.println("=");

        if (c == d)
            System.out.println("+=");

        if (a.equals(b)) // comparing address
            System.out.println("equals");

    }

}
