package objects.Product.Data;

import objects.abstract_objects.Value;

import java.util.Random;

public class ID extends Value {

    public ID(long last_id_value) {
        super("Product ID", last_id_value);
    }

//    public Long generateUniqueLong(LinkedHashMap ids) {
//        Long value;
//
//        do {
//            value = random.nextLong();
//        } while (value <= 0 || ids.containsValue(value));
//
//        return value;
//    }
}
