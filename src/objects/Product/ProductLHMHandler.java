package objects.Product;

import execution_handlers.FileReadHandler;
import execution_handlers.LineHandler;
import execution_handlers.LineScanner;
import execution_handlers.ProgrammingHelpie;
import objects.Product.Data.CoordinatesHandler;
import objects.abstract_objects.CommandDisplay;
import objects.abstract_objects.IObservable;
import objects.abstract_objects.Passer;
import objects.abstract_objects.Space;

import java.util.*;

public class ProductLHMHandler implements IObservable, CommandDisplay, Passer {
    private Space space_;
    private ProductLHM productLHM_ = new ProductLHM();
    private ProductHandler productHandler_ = new ProductHandler(space_.toString());
    private long last_ID_value_ = 0;
    private Date initializationDate_ = new Date();
    public ProductLHMHandler(String space_name) {
        set_space(space_name);
    }

    public void add_element(int key) {
        ProgrammingHelpie.comment("Adding new element to the product list");
        productLHM_.add_element(key, productHandler_.handle_new(last_ID_value_));
        ProgrammingHelpie.comment("Successfully added the new element, new last_ID = " + productLHM_.get_list().size());
        notify_all();
    }

    public void remove_element(int key) {
        productLHM_.remove_element(key);
        notify_all();
    }

    public void display() {
        if(get_size() > 0) {
            program_print("Contents of the list (LinkedHashSet):");
            ProgrammingHelpie.comment("the key set is: " + productLHM_.keySet());
            for (Object key : productLHM_.keySet()) {
                display((int) key);
            }
        }
    }

    public void display(int key) {
        ProgrammingHelpie.comment("Trying to display product with key: " + key);
        Product product = productLHM_.get(key);
        productHandler_.display(product);
    }

    public LinkedHashMap get_list() {
//        ProgrammingHelpie.comment("Getting the list (inside handler)");
        return productLHM_.get_list();
    }

    public String get_type() {
        ProgrammingHelpie.comment("Getting the type of the list : " + productLHM_.get_list().getClass().getSimpleName());
        return productLHM_.get_list().getClass().getSimpleName();
    }
    public int get_size() {
        ProgrammingHelpie.comment("Getting the size of the list (inside handler): " + productLHM_.size());
        return productLHM_.size();
    }
    public Date get_initialization_date() {
        ProgrammingHelpie.comment("Getting the initialization date (inside handler): " + initializationDate_.toString());
        return initializationDate_;
    }
    public void clear() {
        productLHM_.clear();
    }

    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
