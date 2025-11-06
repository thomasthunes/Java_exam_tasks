package post3;

public class Autoboxing {

    public static void get(int i, int j) {
        System.out.print("A");
    }

    public static void get(int i, float j) {
        System.out.print("B");
    }

    public static void get(float i, float j) {
        System.out.print("C");
    }
    public static void get(double... i) {
        System.out.print("D");
    }

    public static void main(String[] args) {
        int i = 1;
        get(1, 2.0);
        get(1, 2);
        get(1, 2.0);

    }
}
