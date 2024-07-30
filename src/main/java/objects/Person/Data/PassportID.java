package objects.Person.Data;

import objects.abstract_objects.Value;

public class PassportID  extends Value {
    public PassportID(String passportID) {
        super("Passport ID");
        set_value(passportID);
    }
    @Override
    public String toString() {
        return get_value().toString();
    }
}
