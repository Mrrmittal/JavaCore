package src.DateAndTimeAPIPractice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateAndTimeMinusAndAdd {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate pastDate = localDate.plusDays(10);

        System.out.println(localDate);
        System.out.println(pastDate);

        Period period = Period.between(pastDate,localDate);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }
}
