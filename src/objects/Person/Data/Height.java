package objects.Person.Data;

import objects.abstract_objects.Value;

public class Height  extends Value {

    public Height(String line) {
        super("Height");
        set_value(Float.parseFloat(line));
    }

    public Height(Float height) {
        super("Height");
        set_value(height);
    }
}
