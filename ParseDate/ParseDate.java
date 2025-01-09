//package ParseDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if(null == stringDate) return null;
        LocalDateTime date = LocalDateTime.parse(stringDate, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        return date;
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if(null == stringDate) return null;
        return LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("EEEE d MMMM yyyy", Locale.FRENCH));
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if(null == stringDate) return null;
        String[] parts = stringDate.split(", ");
        String[] hourPart = parts[0].split(" ");
        String[] minutePart = parts[1].split(" et ");

        int hour = Integer.parseInt(hourPart[0]);
        int minute = Integer.parseInt(minutePart[0].split(" ")[0]);
        int second = Integer.parseInt(minutePart[1].split(" ")[0]);

        if (stringDate.contains("du soir") && hour < 12) {
            hour += 12;
        }

        return LocalTime.of(hour, minute, second);
    }

}
