package objects.commands;

import objects.Product.ProductLHMHandler;
import objects.abstract_objects.CommandHandler;
import objects.abstract_objects.IObservable;
import objects.abstract_objects.IObserver;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShowHandler extends CommandHandler implements IObserver {
    private ProductLHMHandler productLHMHandler_;
    ShowHandler(IObservable productLHMHandler) {
        become_observer(productLHMHandler);
        productLHMHandler_ = (ProductLHMHandler) productLHMHandler;
    }

    public void run(String[] string) {
        productLHMHandler_.display();
    }
}
