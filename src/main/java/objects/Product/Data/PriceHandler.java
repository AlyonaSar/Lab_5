package objects.Product.Data;

import execution_handlers.ProgrammingHelpie;

public class PriceHandler {
    public Price handle(String line) {
        try {
            String[] input_array = line.split("\\s+");
            Long string = Long.parseLong(input_array[0]);
            Price price = new Price(string);
            ProgrammingHelpie.comment("Price set to: " + price.get_value());
            return price;
        } catch (Exception e) {
            System.err.println("Error: Could not convert the input to a valid Price. Please try again.");
            return null;
        }
    }
}
