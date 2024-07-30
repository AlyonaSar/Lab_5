package objects.abstract_objects;

import java.util.LinkedHashMap;
import java.util.Map;

public class SpaceList {
    private static SpaceList instance;
    private Map<String, Space> space_list_;

    // Private constructor to prevent instantiation
    private SpaceList() {
        space_list_ = new LinkedHashMap<>();
    }

    // Static method to get the single instance of the class
    public static SpaceList getInstance() {
        if (instance == null) {
            instance = new SpaceList(); // Create the instance if it doesn't exist
        }
        return instance;
    }

    // Add a simulation to the simulation list
    public void add_space(Space space) {
        space_list_.put(space.toString(), space);
    }

    // Retrieve a specific simulation from the simulation list by its name
    public Space get_space(String space_name) {
        return space_list_.get(space_name);
    }
}
