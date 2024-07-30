package objects.Product.Data;

import execution_handlers.ProgrammingHelpie;
import org.jetbrains.annotations.NotNull;

public class NameHandler {
    public Name handle(String name_line) {
        try {
            ProgrammingHelpie.comment("The line transferred into the Name function is: " + name_line);
            Name name = new Name(name_line);
            ProgrammingHelpie.comment("Name set to: " + name.get_value());
            return name;
        } catch (Exception e) {
            System.err.println("Error: Could not convert the input to a valid Name. Please try again.");
            return null;
        }
    }
}
