package objects.Product;

import execution_handlers.ProgrammingHelpie;
import objects.Product.Data.CoordinatesHandler;
import objects.abstract_objects.CommandDisplay;
import objects.abstract_objects.IObservable;

import java.util.*;

public class ProductLHMHandler implements IObservable, CommandDisplay {
    private ProductLHM productLHM_ = new ProductLHM();
    private long last_ID_value_ = 0;
    private Date initializationDate_ = new Date();
    //private LinkedHashMap<Integer, Product> product_list_ = new LinkedHashMap<>();

    public ProductLHMHandler() {}

    public void add_element(int key) {
        ProgrammingHelpie.comment("Adding new element to the product list");
        productLHM_.add_element(key, last_ID_value_);
        last_ID_value_ = productLHM_.get_list().size();
        ProgrammingHelpie.comment("Successfully added the new element, new last_ID = " + last_ID_value_);
        notify_all();
    }

    public void remove_element(int key) {
        ProgrammingHelpie.comment("Trying to remove the element");
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
        ProductHandler productHandler = new ProductHandler();
        Product product = productLHM_.get(key);
        productHandler.display(product);
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

}
