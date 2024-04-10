package objects.Product.Data;

import execution_handlers.ProgrammingHelpie;

public class PriceHandler {
    public Price handle(String string) {
        Price price = new Price(Long.parseLong(string));
        ProgrammingHelpie.comment("Price set to: " + price.get_value());
        return price;
    }
}
