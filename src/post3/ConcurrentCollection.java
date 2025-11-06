package post3;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollection {

    public static void main(String[] args) {
        var list = List.of("Java", "Duke", "Larry", "James");
        var conList = new CopyOnWriteArrayList<>(list);

        Thread t1 = new Thread(() -> {
            for (String elem : conList) {
                conList.set(list.indexOf(elem), elem.toUpperCase() );
            }
            System.out.print(conList);
        });

        Thread t2 = new Thread(() -> {
            for (String s : conList)
                System.out.print(s + " ");
        });

        t1.start();
        t2.start();

    }
}
