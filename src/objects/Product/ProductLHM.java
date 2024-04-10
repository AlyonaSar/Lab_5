package objects.Product;

import execution_handlers.ProgrammingHelpie;

import java.util.LinkedHashMap;
import java.util.Set;

public class ProductLHM extends LinkedHashMap {
    private LinkedHashMap<Integer, Product> product_list_ = new LinkedHashMap<>();

    void add_element(int key, long last_id) {
        ProgrammingHelpie.comment("Initialising an element in the list");
        product_list_.put(key, new ProductHandler().handle(last_id));
    }
    void add_element(int key, Product product,  long last_id) {
        ProgrammingHelpie.comment("Adding the element");
        product_list_.put(key, new ProductHandler().handle(product, last_id));
    }

    protected void remove_element(int key) {
        ProgrammingHelpie.comment("Trying to remove the element");
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
}
