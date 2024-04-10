package objects.Person.Data;

import execution_handlers.ProgrammingHelpie;

public class HeightHandler {
    public Height handle(String string) {
        Height height = new Height(string);
        ProgrammingHelpie.comment("Height set to: " + height.get_value());
        return height;
    }
}
