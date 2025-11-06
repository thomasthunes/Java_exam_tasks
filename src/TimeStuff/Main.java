package TimeStuff;

import java.time.*;

public class Main {


    public static void main(String[] args) {
        int a = 7;
        int b = ~a;
        int c = a^b;

        LocalDate labourDay = LocalDate.of(2022, Month.MAY, 1);
        LocalDate now = LocalDate.of(2022, 8, 15);

        LocalDate nextLabourDay = labourDay.plusYears(1);
        Period daysUntilLabourDay = now.until(nextLabourDay);
        System.out.println(daysUntilLabourDay);
        System.out.println(nextLabourDay);

        int q = 0;
        loop:
        for (int i = 3; i > 0; i--) {
            for (int j = 0; j < 3; j++, q++) {
                if (j == 2)
                    continue loop;
            }
        }
    }
}
