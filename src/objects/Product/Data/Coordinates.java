package objects.Product.Data;

import objects.abstract_objects.Value;

import java.util.Arrays;

public class Coordinates extends Value {

    public Coordinates(int x, Integer y){
        super("Coordinates");
        set_value(Arrays.asList(x, y));
    }
}
