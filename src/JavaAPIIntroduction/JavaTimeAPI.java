package src.JavaAPIIntroduction;

import java.time.LocalDate;

/*
Java date-time API introduce after java 8 to overcome old date-time API.
 */
//Use of Java.Time API
public class JavaTimeAPI {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // To print Date
        int day = LocalDate.now().getDayOfMonth(); // To print day
        int month = LocalDate.now().getMonthValue(); // To print month
        int year = LocalDate.now().getYear(); // To print year
        System.out.println(day +"/" +month +"/" +year );

//        And many more ................
    }


}
