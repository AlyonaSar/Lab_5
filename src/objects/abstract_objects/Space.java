package objects.abstract_objects;

import java.util.LinkedHashMap;

public class Space {
    // Maps class types to their respective object instances.
    private LinkedHashMap<Class<?>, Object> stuff_list_ = new LinkedHashMap<>();
    private String name_;

    public Space(String name) {
        name_ = name;
    }

    // Add object to the simulation by its class type
    public <T> void add_object(T obj) {
        stuff_list_.put(obj.getClass(), obj);
    }

    // Retrieve object from the simulation by its class type
    @SuppressWarnings("unchecked")
    public <T> T get_object(Class<T> type) {
        return (T) stuff_list_.get(type);
    }

    @Override
    public String toString() {
        return name_;
    }
}
