package post3;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistictWhileparallell {

    public static void main(String[] args) {
        var list1 = List.of("A", "B", "C", "D", "D", "A", "B", "C", "D");
        list1.stream().parallel().distinct().forEach(System.out::print);
    }
}
