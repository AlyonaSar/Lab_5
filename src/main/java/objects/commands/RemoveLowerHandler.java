package objects.commands;

import objects.Product.Product;
import objects.abstract_objects.CommandHandler;
import objects.Product.ProductLHMHandler;
import objects.abstract_objects.Space;

import java.util.LinkedHashMap;

public class RemoveLowerHandler extends CommandHandler {
    private Space space_;

    public RemoveLowerHandler(String space_name) {
        set_space(space_name);
    }
    public void run(String[] input_array) {
        int referenceKey = Integer.parseInt(input_array[1]);
        LinkedHashMap<Integer, Product> list = space_.get_object(ProductLHMHandler.class).get_list();
        list.keySet().removeIf(key -> key.compareTo(referenceKey) < 0);
        System.out.println("Removed keys lower than: " + referenceKey);
    }

    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
