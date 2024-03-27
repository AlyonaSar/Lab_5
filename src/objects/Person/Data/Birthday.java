package objects.Person.Data;

import objects.abstract_objects.Value;

public class Birthday extends Value {
    private java.time.ZonedDateTime birthday_;

    public Birthday(java.time.ZonedDateTime birthday) {

        super("Birthday");
        this.birthday_ = birthday;
    }
}
