package objects.commands;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import execution_handlers.ProgrammingHelpie;
import objects.Product.Product;
import objects.Product.ProductLHMHandler;
import objects.abstract_objects.CommandHandler;
import objects.abstract_objects.Space;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;

public class SaveHandler extends CommandHandler {
    private Space space_;

    public SaveHandler(String space_name) {
        set_space(space_name);
    }

    @Override
    public void run(String[] input_array) {
        ObjectMapper mapper = new ObjectMapper();
        ProductLHMHandler productLHMHandler = space_.get_object(ProductLHMHandler.class);

        LinkedHashMap<Integer, Product> list = productLHMHandler.get_list();
        try {
            mapper.writeValue(new File("products.json"), list);
            ProgrammingHelpie.comment("Products saved to products.json successfully.");
        } catch (IOException e) {
            System.err.println("Failed to save products to JSON: " + e.getMessage());
        }
    }

    @Override
    public void set_space(String space_name) {
        this.space_ = space_list_.get_space(space_name);
    }
}
