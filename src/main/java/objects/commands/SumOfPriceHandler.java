package objects.commands;

import objects.Product.Product;
import objects.Product.ProductLHMHandler;
import objects.abstract_objects.CommandHandler;
import objects.abstract_objects.Space;

import java.util.LinkedHashMap;

public class SumOfPriceHandler extends CommandHandler {
    private Space space_;
    public SumOfPriceHandler(String space_name) {
        set_space(space_name);
    }
    @Override
    public void run(String[] input_array) {
        ProductLHMHandler productLHMHandler_ = space_.get_object(ProductLHMHandler.class);
        LinkedHashMap<Integer, Product> list = productLHMHandler_.get_list();
        double totalSum = 0;
        for (Product product : list.values()) {
            totalSum += product.get_price();  // Assume Product has a method getPrice() that returns a double
        }

        System.out.println("Total sum of prices: " + totalSum);
    }
    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
