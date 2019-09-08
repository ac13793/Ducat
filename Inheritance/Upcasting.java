class UpcastingBase {
    int x = 50;

    void show() {
        System.out.println("Base");
    }
}

class Upcasting extends UpcastingBase {
    int x = 20;

    void show() {
        System.out.println("child will execute");
    }

    public static void main(String... s) {
        UpcastingBase b = new Upcasting();
        b.show();
        System.out.println(b.x);
    }
}