package post3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortImmutableCollection {

    public static void main(String[] args) {
        List<Integer> list = List.of(4, 2, 3, 4, 5, 6, 7, 8, 9);

        list.stream().sorted().forEach(System.out::println);
        //Collections.sort(list);
    }
}
