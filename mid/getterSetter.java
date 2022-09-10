
class something {

    private int num;
    private String nam;

    public String getnam() {

        return nam;
    }

    public void setnam(String n) {
        nam = n;
    }

}

public class getterSetter {

    public static void main(String[] args) {

        something dam = new something();

        // dam.num = 21;
        // dam.nam = "I am DAmber";

        dam.setnam("Hello, this is Damber");

        System.out.println(dam.getnam());

    }

}
