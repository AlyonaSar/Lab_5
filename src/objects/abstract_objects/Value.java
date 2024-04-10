package objects.abstract_objects;

public abstract class Value {
    private String val_name_;
    private Object value_;

    public Value(String val_name) {
        set_value_name(val_name);
    }
    public Value(String val_name, Object value) {
        set_value_name(val_name);
        set_value(value);
    }

    public void set_value_name(String val_name) {
        this.val_name_ = val_name;
    }

    public String get_value_name() {
        return val_name_;
    }

    public void set_value(Object value) {
        this.value_ = value;
    }
    public Object get_value() {
        return value_;
    }
}
