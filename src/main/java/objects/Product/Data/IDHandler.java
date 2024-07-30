package objects.Product.Data;

import execution_handlers.ProgrammingHelpie;

public class IDHandler {
    public ID handle(long creation_id_value) {
        try {
            long id_value = creation_id_value;
            ID id = new ID(id_value);
            ProgrammingHelpie.comment("ID set to: " + id.get_value());
            return id;
        } catch (Exception e) {
            System.err.println("Error: Could not create a valid ID.");
            return null;
        }
    }

    public ID handle_next(Object current_id_value) {
        try {
            long id_value = (long) current_id_value;
            return handle(id_value + 1);
        }  catch (Exception e) {
            System.err.println("Error: Could not convert the input to a valid ID. Please try again." + e);
            return null;
        }
    }
}
