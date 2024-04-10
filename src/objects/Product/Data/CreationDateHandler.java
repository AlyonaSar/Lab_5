package objects.Product.Data;

import execution_handlers.ProgrammingHelpie;

public class CreationDateHandler {

    public CreationDate handle() {
        CreationDate creationDate = new CreationDate();
        ProgrammingHelpie.comment("Creation Date is set to: " + creationDate.get_value());
        return creationDate;
    }
}
