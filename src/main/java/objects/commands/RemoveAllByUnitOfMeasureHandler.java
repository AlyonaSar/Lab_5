package objects.commands;

import objects.Product.Data.UnitOfMeasure;
import objects.Product.Product;
import objects.Product.ProductLHMHandler;
import objects.abstract_objects.CommandHandler;
import objects.abstract_objects.Space;

import java.util.LinkedHashMap;

public class RemoveAllByUnitOfMeasureHandler extends CommandHandler {
    private Space space_;
    public RemoveAllByUnitOfMeasureHandler(String space_name) {
        set_space(space_name);
    }
    /*
    @Override
    public void run(String[] input_array) {
        String value = input_array[1];
        LinkedHashMap<Integer, Product> list = space_.get_object(ProductLHMHandler.class).get_list();
        list.entrySet().removeIf(entry -> entry.getValue().get_unit_of_measure().toString() == value);
    } */
    @Override
    public void run(String[] input_array) {
        String unitString = input_array[1];
        LinkedHashMap<Integer, Product> list = space_.get_object(ProductLHMHandler.class).get_list();
        UnitOfMeasure targetUnit;
        try {
            targetUnit = UnitOfMeasure.fromString(unitString);
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid unit of measure provided: " + unitString);
            return;
        }
        final UnitOfMeasure finalTargetUnit = targetUnit;
        list.entrySet().removeIf(entry -> entry.getValue().get_unit_of_measure() == finalTargetUnit);
    }


    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
