public class overflow {

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE - 3;

        for (int i = 0; i < 6; ++i) {
            System.out.println(++a);

        }

    }

}
