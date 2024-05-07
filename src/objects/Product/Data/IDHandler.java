package objects.Product.Data;

import execution_handlers.ProgrammingHelpie;

public class IDHandler {
    public ID handle(Object id_obj_value) {
        try {
            long id_value = (long) id_obj_value;
            ID id = new ID(id_value);
            ProgrammingHelpie.comment("ID set to: " + id.get_value());
            return id;
        } catch (Exception e) {
            System.err.println("Error: Could not convert the input to a valid ID. Please try again.");
            return null;
        }
    }

    public ID handle_next(Object id_obj_value) {
        try {
            long id_value = (long) id_obj_value;
            return handle(id_value + 1);
        }  catch (Exception e) {
            System.err.println("Error: Could not convert the input to a valid ID. Please try again.");
            return null;
        }
    }
}
