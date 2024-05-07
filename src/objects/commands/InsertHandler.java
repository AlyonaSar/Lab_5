package objects.commands;

import execution_handlers.ProgrammingHelpie;
import objects.Product.ProductLHM;
import objects.Product.ProductLHMHandler;
import objects.abstract_objects.CommandHandler;
import objects.abstract_objects.IObservable;
import objects.abstract_objects.IObserver;

import java.util.Map;

public class InsertHandler extends CommandHandler implements IObserver {

    ProductLHMHandler productLHMHandler_;

    public InsertHandler(IObservable productLHMHandler) {
        productLHMHandler_ = (ProductLHMHandler) productLHMHandler;
    }
    @Override
    public void run(String[] input_array) throws InvalidParameterException, ArrayIndexOutOfBoundsException {
        try {
            ProgrammingHelpie.comment("Trying to add the element");
            int key = Integer.parseInt(input_array[1]);
            productLHMHandler_.add_element(key);
        } catch(InvalidParameterException e) {
            System.out.println(e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e) {
        }
    }
}
