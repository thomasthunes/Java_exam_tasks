package post3;

public class SwitchStuff {

    public static void main(String[] args) {
        final int e = 7;
        int newE = e;

        switch (newE) {
            case 1 -> newE = 2;
            case 2 -> newE = 3;
            case 3 -> newE = 4;
            case 4 -> newE = 5;
            //default -> newE = 6;
        }
        System.out.println(newE);

    }
}
