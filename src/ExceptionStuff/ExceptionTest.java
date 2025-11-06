package ExceptionStuff;

import java.io.IOException;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExceptionTest{

    public static void main(String[] args) throws IOException {
        int a = 2;
        int b = ~a;
        int c = a^b;
        boolean e = a > b & a < c++;
        System.out.println(e + " " + c);
        boolean f = a > b && a > c++;
        System.out.println(f + " " + c);



    }

}
