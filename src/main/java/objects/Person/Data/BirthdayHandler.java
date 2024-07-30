package objects.Person.Data;

import execution_handlers.ProgrammingHelpie;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class BirthdayHandler {
    private String format_;
    public BirthdayHandler() {
        format_ = "yyyy-MM-dd";
    }
    public Birthday handle(Object info) {
        try {
            String string = (String) info;
            ProgrammingHelpie.comment("Trying to format the input");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format_);
            LocalDate localDate = LocalDate.parse(string, formatter);
            ZoneId zoneId = ZoneId.of("UTC");
            ZonedDateTime zonedDateTime = localDate.atStartOfDay(zoneId);
            ProgrammingHelpie.comment("Got through the parsing of Birthday date");
            Birthday birthday = new Birthday(zonedDateTime);
            ProgrammingHelpie.comment("Birthday set to: " + birthday.get_value());
            return birthday;
        } catch (Exception e) {
            System.err.println("Error: Could not convert the input to a valid Birthday. Please try again.");
            return null;
        }
    }
    public String get_format() {
        return format_;
    }
}
