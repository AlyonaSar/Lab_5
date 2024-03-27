package objects.abstract_objects;

public class Value {
    private String val_name_;

    public Value(String val_name) {
        set_value_name(val_name);
    }

    public void set_value_name(String val_name) {
        this.val_name_ = val_name;
    }

    public String get_value_name() {
        return val_name_;
    }
}
