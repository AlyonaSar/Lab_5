package objects.commands;

import execution_handlers.ProgrammingHelpie;
import objects.Product.Product;
import objects.Product.ProductLHMHandler;
import objects.abstract_objects.CommandHandler;
import objects.abstract_objects.Space;

import java.util.LinkedHashMap;

public class RemoveGreaterKeyHandler extends CommandHandler {
    private Space space_;
    public RemoveGreaterKeyHandler(String space_name) {
        set_space(space_name);
    }
    @Override
    public void run(String[] input_array) {
        LinkedHashMap<Integer, Product> list = space_.get_object(ProductLHMHandler.class).get_list();
        try {
            int key = Integer.parseInt(input_array[1]);
            list.keySet().removeIf(currentKey -> currentKey > key);
            ProgrammingHelpie.comment("Removed keys greater than: " + key);
        } catch (NumberFormatException e) {
            ProgrammingHelpie.comment("Error: The input key is not a valid integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            ProgrammingHelpie.comment("Error: No input key provided.");
        }
    }
    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}