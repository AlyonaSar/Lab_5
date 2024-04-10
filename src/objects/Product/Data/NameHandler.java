package objects.Product.Data;

import execution_handlers.ProgrammingHelpie;

public class NameHandler {
    public Name handle(String string) {
        ProgrammingHelpie.comment("The line transferred into the Name function is: " + string);
        Name name = new Name(string);
        ProgrammingHelpie.comment("Name set to: " + name.get_value());
        return name;
    }
}
