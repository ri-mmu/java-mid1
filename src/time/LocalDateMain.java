package time;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        LocalDate plusDays = ofDate.plusDays(10);
        System.out.println("지정 날짱+10d = " + plusDays);
    }

}
