package post3;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantStuff {

    public static void main(String[] args) throws InterruptedException {
        Instant start = Instant.now();
        System.out.println(start);
        Thread.sleep(1000);

        Instant end = Instant.now();

        end.truncatedTo(ChronoUnit.DAYS);
        var y = end.truncatedTo(ChronoUnit.MINUTES);

        System.out.println(end);

        if (end.isAfter(y)) {
            System.out.println(end);
        }
    }
}
