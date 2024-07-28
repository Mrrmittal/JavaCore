package src.DateAndTimeAPIPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class PrintDateAndTime {
    public static void main(String[] args) {
        // Print Only date
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear() +"/"+ localDate.getMonth() +"/" +localDate.getDayOfMonth());

        // Print Only time
        LocalTime localTime = LocalTime.now();
        System.out.println(
                "Hour - " + localTime.getHour()+
                "Min - "  + localTime.getMinute()+
                "Sec - "  + localTime.getSecond()+
                "Nano Sec - "+ localTime.getNano()
        );
    }
}
