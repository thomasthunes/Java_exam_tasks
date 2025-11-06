package post3;

import java.util.List;

public class Outer {
    int var1 = 0;
    public int var2 = 0;

    class inner{
        int var3 = 3;
        int var4 = 3;
        void m4(){
            System.out.println(var1);
        }
    }

    void m1(){

    }

    public static void main(String[] args) {
        Outer.inner inner = new Outer().new inner();

        int var3 = inner.var3;
        int var4 = inner.var4;
        inner.m4();

    }
}
