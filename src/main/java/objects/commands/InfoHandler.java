package objects.commands;

import objects.Product.ProductLHMHandler;
import objects.abstract_objects.*;

public class InfoHandler extends CommandHandler implements IObserver, Passer {
    private Space space_;

    public InfoHandler(String space_name) {
        set_space(space_name);
    }

    @Override
    public void run(String[] input_array) throws InvalidParameterException {
        ProductLHMHandler productLHMHandler_ = space_.get_object(ProductLHMHandler.class);
        print("LinkedHashMap Information:");
        print("    Type: " + productLHMHandler_.get_type());
        print("    Initialization Date: " + productLHMHandler_.get_initialization_date());
        print("    Number of Elements: " + productLHMHandler_.get_size());
        print("    Elements: " + productLHMHandler_.get_list());
    }

    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
