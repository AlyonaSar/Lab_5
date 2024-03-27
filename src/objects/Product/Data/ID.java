package objects.Product.Data;

import objects.abstract_objects.Value;

public class ID extends Value {
    private Long id_;

    public ID(Long id) {

        super("Product ID");
        this.id_ = id;
    }
}
