
class something {

    private int num;
    private String nam;

    public String getnam() {

        return nam;
    }

    public void setnam(String n) {
        this.nam = n;
    }

    public int getnum() {
        return num;
    }

    public void setnum(int a) {
        this.num = a;
    }

}

public class getterSetter {

    public static void main(String[] args) {

        something dam = new something();

        // dam.num = 21;
        // dam.nam = "I am DAmber";

        dam.setnam("Hello, this is Damber");
        dam.setnum(21);

        System.out.println(dam.getnam());
        System.out.println(dam.getnum());

    }

}
