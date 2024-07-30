package objects.Person.Data;

import execution_handlers.ProgrammingHelpie;

public class HeightHandler {
    public Height handle(Object info) {
        try {
            String string = (String) info;
            Height height = new Height(string);
            ProgrammingHelpie.comment("Height set to: " + height.get_value());
            return height;
        } catch (Exception e) {
            System.err.println("Error: Could not convert the input to a valid Height. Please try again.");
            return null;
        }
    }
}
