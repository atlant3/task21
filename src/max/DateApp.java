package max;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Today -" + date);
        System.out.println("Local Date - " + ld(date));
        System.out.println("Local Time - " + lt(date));
        System.out.println("Local Date Time - " + ldt(date));

    }
    public static LocalDate ld(Date date) {
        LocalDate ld = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return ld;
    }
    public static LocalTime lt(Date date) {
        LocalTime lt = date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
        return lt;
    }
    public static LocalDateTime ldt (Date date) {
        LocalDateTime ldt = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        return ldt;
    }
}
