package objects.abstract_objects;

abstract public class Name extends Value {
    private String name_;

    public Name(String name) {

        super("Name");

        if (name == null) {
            throw new IllegalArgumentException(get_value_name() + " cannot be null");
        }
        this.name_ = name;
    }
}
