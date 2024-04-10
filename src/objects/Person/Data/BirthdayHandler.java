package objects.Person.Data;

import execution_handlers.ProgrammingHelpie;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class BirthdayHandler {

    public Birthday handle(String string) {
        ProgrammingHelpie.comment("Trying to format the input");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(string, formatter);
        ZoneId zoneId = ZoneId.of("UTC");
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(zoneId);
        ProgrammingHelpie.comment("Got through the parsing of Birthday date");
        Birthday birthday = new Birthday(zonedDateTime);
        ProgrammingHelpie.comment("Birthday set to: " + birthday.get_value());
        return birthday;
    }
}
