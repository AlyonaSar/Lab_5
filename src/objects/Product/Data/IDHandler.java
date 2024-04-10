package objects.Product.Data;

import execution_handlers.ProgrammingHelpie;

public class IDHandler {
    public ID handle(long id_value) {
        ID id = new ID(id_value);
        ProgrammingHelpie.comment("ID set to: " + id.get_value());
        return id;
    }

    public ID handle_next(long id_value) {
        ID id = new ID(id_value + 1);
        ProgrammingHelpie.comment("ID set to: " + id.get_value());
        return id;
    }
}
