package objects.commands;

import objects.Product.ProductLHMHandler;
import objects.abstract_objects.CommandHandler;
import objects.abstract_objects.IObservable;
import objects.abstract_objects.IObserver;
import objects.abstract_objects.Passer;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShowHandler extends CommandHandler implements IObserver, Passer {
    private ProductLHMHandler productLHMHandler_;
    ShowHandler(IObservable productLHMHandler) {
        productLHMHandler_ = (ProductLHMHandler) productLHMHandler;
    }

    public void run(String[] string) {
        productLHMHandler_.display();
    }


    @Override
    public void update() {

    }

    @Override
    public void set_space(String space_name) {

    }
}
