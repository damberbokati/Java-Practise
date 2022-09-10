
class Damber {

    int age;
    String name;

    public void test() {

        System.out.println("Age is: " + age);
        System.out.println("Name is: " + name);

    }

}

public class functionnn {

    public static void main(String[] args) {

        Damber get = new Damber();

        get.age = 21;
        get.name = "HEllo Damber!";

        // System.out.println(get.age);
        // System.out.println(get.name);

        get.test();

    }

}
