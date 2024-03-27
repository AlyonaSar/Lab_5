package objects.Person.Data;

import objects.abstract_objects.Value;

public class Height  extends Value {
    private Float height_;

    public Height(Float height) {

        super("Height");
        this.height_ = height;
    }
}
