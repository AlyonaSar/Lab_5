package objects.commands;

import objects.Product.ProductLHMHandler;
import objects.abstract_objects.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShowHandler extends CommandHandler implements IObserver, Passer {
    private Space space_;
    ShowHandler(String space_name) {
        set_space(space_name);
    }
    public void run(String[] string) {
        ProductLHMHandler productLHMHandler_ = space_.get_object(ProductLHMHandler.class);
        productLHMHandler_.display();
    }
    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
