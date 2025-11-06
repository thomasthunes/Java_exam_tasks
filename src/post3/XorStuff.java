package post3;

public class XorStuff {

    public static void main(String[] args) {
        int a = 2;
        int b = ~a;
        int c = a^b;

        boolean e = a > b & a < c++;
        System.out.println(e + " " + c);
        boolean f = a > b && a > c++;
        System.out.println(f + " " + c);

        /*
        false 0
        true 2
        */

    }
}
