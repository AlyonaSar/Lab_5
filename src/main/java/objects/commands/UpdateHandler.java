package objects.commands;

import execution_handlers.ProgrammingHelpie;
import objects.Product.ProductLHMHandler;
import objects.abstract_objects.CommandHandler;
import objects.abstract_objects.Space;

public class UpdateHandler extends CommandHandler {
    private Space space_;
    public UpdateHandler(String space_name) {
        set_space(space_name);
    }
    @Override
    public void run(String[] input_array) throws InvalidParameterException, ArrayIndexOutOfBoundsException {
        ProductLHMHandler productLHMHandler_ = space_.get_object(ProductLHMHandler.class);
        try {
            ProgrammingHelpie.comment("Trying to update the element");
            productLHMHandler_ = space_.get_object(ProductLHMHandler.class);
            int key = Integer.parseInt(input_array[1]);
            productLHMHandler_.add_element(key);
        } catch(InvalidParameterException e) {
            System.out.println(e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
