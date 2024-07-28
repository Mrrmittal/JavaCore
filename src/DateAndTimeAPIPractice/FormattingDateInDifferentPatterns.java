package src.DateAndTimeAPIPractice;

import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingDateInDifferentPatterns {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

        String formattedDate = localDateTime.format(formatter);

        System.out.println(formattedDate);
    }
}
