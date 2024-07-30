package objects.Product;

import execution_handlers.*;
import objects.Person.*;
import objects.Product.Data.*;
import objects.abstract_objects.CommandDisplay;
import objects.abstract_objects.Passer;
import objects.abstract_objects.Space;

public class ProductHandler implements CommandDisplay, Passer {
    private Space space_;
    public ProductHandler(String space_name) {
        set_space(space_name);
    }
    public Product handle() {
        InteractionHandler interactionHandler_ = space_.get_object(InteractionHandler.class);
        ID id = new IDHandler().handle_next((long) space_.get_object(ProductLHMHandler.class).get_size());
        String line = interactionHandler_.ask("name");
        Name name = new NameHandler().handle(line);
        line = interactionHandler_.ask("coordinates");
        Coordinates coordinates = new CoordinatesHandler().handle(line);
        line = interactionHandler_.ask("price");
        Price price = new PriceHandler().handle(line);
        line = interactionHandler_.ask("unit of measure (" + UnitOfMeasure.get_values() + ")");
        UnitOfMeasure unitOfMeasure = new UnitOfMeasureHandler().handle(line);
        PersonHandler ownerHandler_ = new PersonHandler(space_.toString());
        ownerHandler_.handle();
        CreationDate creationDate = new CreationDateHandler().handle();

        Product product = new Product(
                id,
                name,
                coordinates,
                creationDate,
                price,
                unitOfMeasure,
                ownerHandler_);

        return product;
    }

    public Product handle_new() {
        long last_id = space_.get_object(ProductLHMHandler.class).get_size();
        Product product = handle();
        product.set_id(new IDHandler().handle_next(last_id));
        return product;
    }
    public void display(Product product) {
        ProgrammingHelpie.comment("Successfully got into the display of product. Displaying variables down below");
        InteractionHandler printer = space_.get_object(InteractionHandler.class);
        printer.print("Displaying product with ID: " + product.get_id());
        printer.print("     The name is: " + product);
        printer.print("     The coordinates are: " + product.get_coordinates().toString());
        printer.print("     The creation date is: " + product.get_creation_date().toString());
        printer.print("     The price is: " + product.get_price().toString());
        printer.print("     The unit of measure is: " + product.get_unit_of_measure().toString());
        printer.print("     The owner parameters are:");
        product.get_person_handler().display("     ");
    }

    @Override
    public void set_value(Object object) {}

    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
