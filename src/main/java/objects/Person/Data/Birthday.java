package objects.Person.Data;

import java.time.ZonedDateTime;

import objects.abstract_objects.Value;

public class Birthday extends Value {

    public Birthday(java.time.ZonedDateTime birthday) {
        super("Birthday");
        set_value(birthday);
    }
    @Override
    public String toString() {
        return get_value().toString();
    }
}
