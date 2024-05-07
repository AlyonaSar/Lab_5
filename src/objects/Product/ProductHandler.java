package objects.Product;

import execution_handlers.*;
import objects.Person.*;
import objects.Product.Data.*;
import objects.abstract_objects.CommandDisplay;
import objects.abstract_objects.Passer;
import objects.abstract_objects.Space;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ProductHandler implements CommandDisplay, Passer {
    private Space space_;
    public ProductHandler(String space_name) {
        set_space(space_name);
    }
    public Product handle() {
        InteractionHandler interactionHandler_ = space_.get_object(InteractionHandler.class);
        ID id = new IDHandler().handle_next(space_.get_object(ProductLHMHandler.class));
        String line = interactionHandler_.ask("name");
        Name name = new NameHandler().handle(line);
        line = interactionHandler_.ask("coordinates");
        Coordinates coordinates = new CoordinatesHandler().handle(line);
        line = interactionHandler_.ask("price");
        Price price = new PriceHandler().handle(line);
        line = interactionHandler_.ask("unit of measure (" + UnitOfMeasure.values() + ")");
        UnitOfMeasure unitOfMeasure = new UnitOfMeasureHandler().handle(line);
        Person owner = new PersonHandler(space_.toString()).handle();
        CreationDate creationDate = new CreationDateHandler().handle();

        /*
        ID id = new IDHandler().handle_next(list.get(0));
        Name name = new NameHandler().handle(list.get(1));
        Coordinates coordinates = new CoordinatesHandler().handle(list.get(2));
        Price price = new PriceHandler().handle(list.get(3));
        UnitOfMeasure unitOfMeasure = new UnitOfMeasureHandler().handle(list.get(4));
        ArrayList<Object> subList = (ArrayList<Object>) list.subList(4, list.size());
        Person owner = new PersonHandler().handle(subList);
        CreationDate creationDate = new CreationDateHandler().handle();
        */

        Product product = new Product(
                id,
                name,
                coordinates,
                creationDate,
                price,
                unitOfMeasure,
                owner);

        return product;
    }

    public Product handle_new(long last_id) {
        Product product = handle();
        product.set_id(new IDHandler().handle_next(last_id));
        return product;
    }

    public void display(Product product) {
        ProgrammingHelpie.comment("Successfully got into the display of product. Displaying variables down below");
        program_print("     The ID is: " + product.get_id());
        program_print("     The name is: " + product.get_name());
        program_print("     The coordinates are: " + product.get_coordinates().toString());
        program_print("     The creation date is: " + product.get_creation_date().toString());
        program_print("     The price is: " + product.get_price().toString());
        program_print("     The unit of measure is: " + product.get_unit_of_measure().toString());
        program_print("     The owner is: " + product.get_owner().toString());
    }

    @Override
    public void set_value(Object object) {}

    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
