package objects.commands;

import objects.Product.ProductLHM;
import objects.Product.ProductLHMHandler;
import objects.abstract_objects.CommandHandler;
import objects.abstract_objects.IObservable;
import objects.abstract_objects.IObserver;

public class InfoHandler extends CommandHandler implements IObserver {
    private ProductLHMHandler productLHMHandler_;

    public InfoHandler(IObservable productLHMHandler) {
        become_observer(productLHMHandler);
        productLHMHandler_ = (ProductLHMHandler) productLHMHandler;
    }

    @Override
    public void run(String[] input_array) throws InvalidParameterException {
        program_print("LinkedHashMap Information:");
        program_print("    Type: " + productLHMHandler_.get_type());
        program_print("    Initialization Date: " + productLHMHandler_.get_initialization_date());
        program_print("    Number of Elements: " + productLHMHandler_.get_size());
        program_print("    Elements: " + productLHMHandler_.get_list());
    }

}
