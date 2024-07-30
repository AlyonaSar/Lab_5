package objects.commands;

import execution_handlers.ProgrammingHelpie;
import objects.Product.ProductLHMHandler;
import objects.abstract_objects.CommandHandler;
import objects.abstract_objects.Passer;
import objects.abstract_objects.Space;

public class ClearHandler extends CommandHandler implements Passer {
    private Space space_;
    public ClearHandler(String space_name) {
        set_space(space_name);
    }
    @Override
    public void run(String[] input_array) throws InvalidParameterException {
        space_.get_object(ProductLHMHandler.class).clear();
        ProgrammingHelpie.comment("Cleared the structure!");
    }

    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
