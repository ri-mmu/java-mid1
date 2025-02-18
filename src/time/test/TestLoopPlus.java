package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2024, 1, 1);
/*        System.out.println("날짜 " + 1 +": " + d);
        LocalDate changedD = d.plusWeeks(2);
        for (int i = 2; i < 6; i++) {
            System.out.println("날짜 " + i +": " + changedD);
            changedD = changedD.plusWeeks(2);
        }*/
        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = d.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println("날짜 " + (i + 1) +": " + nextDate);
        }
    }
}
