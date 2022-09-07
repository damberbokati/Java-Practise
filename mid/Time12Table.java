public class Time12Table {

    public static void main(String[] args) {

        System.out.printf("\n\n %15s Times 12 Table\n\n", "");

        System.out.print("     ");

        for (int i = 0; i <= 12; ++i) {
            System.out.printf("%4d ", i);
        }

        System.out.printf("\n       ");

        for (int i = 0; i <= 12; ++i) {
            System.out.printf("---- ", i);
        }

        for (int j = 0; j <= 12; ++j) {
            System.out.printf("\n%2d | ", j);

            for (int i = 0; i <= 12; ++i) {
                System.out.printf(" %4d", i * j);
            }
        }
        System.out.println();

    }

}
