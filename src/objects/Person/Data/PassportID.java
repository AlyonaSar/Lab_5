package objects.Person.Data;

import objects.abstract_objects.Value;

public class PassportID  extends Value {
    private String passportID_;

    public PassportID(String passportID) {

        super("Passport ID");
        this.passportID_ = passportID;
    }
}
