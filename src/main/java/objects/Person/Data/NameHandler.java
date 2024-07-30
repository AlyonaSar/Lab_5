package objects.Person.Data;


import execution_handlers.ProgrammingHelpie;

public class NameHandler {
    public Name handle(Object name_string) {
        try {
            Name name = new Name((String) name_string);
            ProgrammingHelpie.comment("Name set to: " + name.get_value());
            return name;
        } catch (Exception e) {
            System.err.println("Error: Could not convert the input to a valid Name. Please try again.");
            return null;
        }
    }
}
