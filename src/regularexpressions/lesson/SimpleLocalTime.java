package regularexpressions.lesson;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SimpleLocalTime {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime fromLocalTime = localTime.atDate(localDate);
        LocalDateTime fromLocalDate = localDate.atTime(localTime);

        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);

        System.out.println("=============");

        System.out.println("From date " + fromLocalDate);
        System.out.println("From time " + fromLocalTime);
    }
}
