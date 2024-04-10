package objects.Product;

import execution_handlers.ProgrammingHelpie;
import objects.Person.*;
import objects.Product.Data.*;
import objects.abstract_objects.CommandDisplay;
import org.jetbrains.annotations.NotNull;

public class ProductHandler implements CommandDisplay {

    public Product handle(long last_id) {

        ID id = new IDHandler().handle_next(last_id);
        String line = program_ask("What is the name?");
        Name name = new NameHandler().handle(line);
        line = program_ask("What are the coordinates?");
        Coordinates coordinates = new CoordinatesHandler().handle(line);
        line = program_ask("What is the price?");
        Price price = new PriceHandler().handle(line);
        line = program_ask("What is the unit of measure?");
        UnitOfMeasure unitOfMeasure = new UnitOfMeasureHandler().handle(line);
        Person owner = new PersonHandler().handle();
        CreationDate creationDate = new CreationDateHandler().handle();

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

    public Product handle(Product product, long last_id) {
//        product.set_id(new IDHandler().handle_next(last_id));
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

}
