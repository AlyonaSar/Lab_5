package objects.Product.Data;

import objects.abstract_objects.Value;

public class Price extends Value {
    private Long price_;

    public Price(Long price) {

        super("Product price");
        set_value(price);
    }
}
