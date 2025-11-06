package post3;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByFrequency {
    public static void main(String[] args) {
        var list1 = List.of("Car" , "bicycle", "truck", "Car");
        var list2 = List.of("Car" , "truck", "motorcycle");

        var map = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
