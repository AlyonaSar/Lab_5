package objects.Product.Data;

import execution_handlers.ProgrammingHelpie;

public class PriceHandler {
    public Price handle(Object line) {
        try {
            Long string = (Long) line;
            Price price = new Price(string);
            ProgrammingHelpie.comment("Price set to: " + price.get_value());
            return price;
        } catch (Exception e) {
            System.err.println("Error: Could not convert the input to a valid Price. Please try again.");
            return null;
        }
    }
}
