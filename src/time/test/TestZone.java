package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024, 1, 1, 9, 0, 0);
        ZonedDateTime seoul = ZonedDateTime.of(dt, ZoneId.of("Asia/Seoul"));
        ZonedDateTime london = seoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newyork = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간: " + seoul);
        System.out.println("런던 회의 시간: " + london);
        System.out.println("뉴욕 회의 시간: " + newyork);


        /*서울의 회의 시간: 2024-01-01T09:00+09:00[Asia/Seoul]
        런던의 회의 시간: 2024-01-01T00:00Z[Europe/London]
        뉴욕의 회의 시간: 2023-12-31T19:00-05:00[America/New_York]*/
    }
}
