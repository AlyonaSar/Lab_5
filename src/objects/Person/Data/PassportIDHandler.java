package objects.Person.Data;

import execution_handlers.ProgrammingHelpie;

public class PassportIDHandler {
    public PassportID handle(String string) {
        PassportID passportID = new PassportID(string);
        ProgrammingHelpie.comment("PassportID set to: " + passportID.get_value());
        return passportID;
    }
}
