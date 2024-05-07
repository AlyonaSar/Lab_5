package objects.Product;

import execution_handlers.FileReadHandler;
import execution_handlers.LineHandler;
import execution_handlers.LineScanner;
import execution_handlers.ProgrammingHelpie;
import objects.abstract_objects.Passer;
import objects.abstract_objects.Space;

import java.util.LinkedHashMap;
import java.util.Set;

public class ProductLHM extends LinkedHashMap implements Passer {
    private Space space_;
    private LinkedHashMap<Integer, Product> product_list_ = new LinkedHashMap<>();

    void add_element(int key, long last_id) {
        ProgrammingHelpie.comment("Initialising an element in the list");
        product_list_.put(key, space_.get_object(ProductHandler.class).handle());
    }
    void add_element(int key, Product product) {
        ProgrammingHelpie.comment("Adding the element");
        product_list_.put(key, product);
    }

    protected void remove_element(int key) {
        product_list_.remove(key);
    }

    @Override
    public int size() {
//        ProgrammingHelpie.comment("Getting the size of the list");
        return product_list_.size();
    }

    protected LinkedHashMap<Integer, Product> get_list() {
//        ProgrammingHelpie.comment("Getting the list (inside the list)");
        return product_list_;
    }

    @Override
    public Set<Integer> keySet() {
        return product_list_.keySet();
    }

    @Override
    public Product get(Object key) {
        return product_list_.get(key);
    }

    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
