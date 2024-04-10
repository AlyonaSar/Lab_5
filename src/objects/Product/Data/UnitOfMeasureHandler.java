package objects.Product.Data;

import execution_handlers.ProgrammingHelpie;

public class UnitOfMeasureHandler {
    public UnitOfMeasure handle(String string) {
        UnitOfMeasure unitOfMeasure = UnitOfMeasure.fromString(string);
        ProgrammingHelpie.comment("Unit of measure set to: " + unitOfMeasure.getValue());
        return unitOfMeasure;
    }
}
