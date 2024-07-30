package objects.Person.Data;

import execution_handlers.ProgrammingHelpie;

public class PassportIDHandler {
    public PassportID handle(Object info) {
        try {
            String string = (String) info;
            PassportID passportID = new PassportID(string);
            ProgrammingHelpie.comment("PassportID set to: " + passportID.get_value());
            return passportID;
        } catch (Exception e) {
            System.err.println("Error: Could not convert the input to a valid PassportID. Please try again.");
            return null;
        }
    }
}
