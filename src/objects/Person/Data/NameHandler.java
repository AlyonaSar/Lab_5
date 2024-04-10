package objects.Person.Data;


import execution_handlers.ProgrammingHelpie;

public class NameHandler {
    public Name handle(String name_string) {
        Name name = new Name(name_string);
        ProgrammingHelpie.comment("Name set to: " + name.get_value());
        return name;
    }
}
