package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.printf("월을 입력하세요: ");
        int month = scanner.nextInt();
        LocalDate date = LocalDate.of(year, month, 1);
        LocalDate nextDate = LocalDate.of(year, month + 1, 1);
        long dDay = ChronoUnit.DAYS.between(date, nextDate);
        printCalendar(date, dDay);
    }

    private static void printCalendar(LocalDate date, long dDay) {
        System.out.println(" Su Mo Tu We Th Fr Sa");
        DayOfWeek week = date.getDayOfWeek();

        //월요일=1(1%7=1), ... 일요일=7(7%7=0)
        int tab = week.getValue() % 7;
        for (int i = 0; i < tab; i++) {
            System.out.printf("   ");
        }

        for (int i = 0; i < dDay; i++) {
            System.out.printf("%3d", (i + 1));
            if (i % 7 == 6 - tab) {
                System.out.println();
            }
        }
    }

}
