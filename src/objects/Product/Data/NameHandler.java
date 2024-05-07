package objects.Product.Data;

import execution_handlers.ProgrammingHelpie;
import org.jetbrains.annotations.NotNull;

public class NameHandler {
    public Name handle(Object line) {
        try {
            String string = (String) line;
            ProgrammingHelpie.comment("The line transferred into the Name function is: " + string);
            Name name = new Name(string);
            ProgrammingHelpie.comment("Name set to: " + name.get_value());
            return name;
        } catch (Exception e) {
            System.err.println("Error: Could not convert the input to a valid Name. Please try again.");
            return null;
        }
    }
}
