package objects.Product.Data;

import execution_handlers.ProgrammingHelpie;

public class UnitOfMeasureHandler {
    public UnitOfMeasure handle(Object line) {
        try {
            String string = (String) line;
            UnitOfMeasure unitOfMeasure = UnitOfMeasure.fromString(string);
            ProgrammingHelpie.comment("Unit of measure set to: " + unitOfMeasure.getValue());
            return unitOfMeasure;
        } catch (Exception e) {
            System.err.println("Error: Could not convert the input to a valid UnitOfMeasure. Please try again.");
            return null;
        }
    }
}
