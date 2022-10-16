package sixthWeek;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        LocalDate date = LocalDate.of(2022, 10, 16);
        System.out.println(date);
        System.out.println(date.minusDays(55));
        
    }
}
