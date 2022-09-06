public class compare {

    public static void main(String[] args) {

        Integer i = 50; // using integer instead of int //comparing address
        Integer j = 50;

        if (i == j)
            System.out.println("==");

        Integer a = 100000;
        Integer b = 100000;

        if (i.equals(j))
            System.out.println("equal"); // comparing nums
    }

}
