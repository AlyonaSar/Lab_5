package objects.abstract_objects;

abstract public class Name extends Value {
    private String name_;

    public Name(String name_line) {

        super("Name");
        if (name_line == null) {
            throw new IllegalArgumentException(get_value_name() + " cannot be null");
        }
        set_value(name_line);
    }

    public String ToString() {
        return name_;
    }
}
