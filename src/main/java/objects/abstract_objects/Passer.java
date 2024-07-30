package objects.abstract_objects;

import java.lang.reflect.Array;
import java.util.LinkedHashMap;
import java.util.Map;

public interface Passer extends HeadPasser {

    SpaceList space_list_ = SpaceList.getInstance();
    void set_space(String space_name);

    // space_ = spaceList_.get_space(String space_name);

/*
    default void pass_add_element(Object object) {
        pass_array_().put(object.getClass().getSimpleName(), object);
    }

    default Object pass_get_element(String class_name) {
        return pass_array_().get(class_name);
    }
    default LinkedHashMap<String, Object> pass_get_list() {
        return pass_array_();
    }

    default void pass_upload(Object[] passed_array) {
        for (Object object : passed_array) {
            String element_name = object.getClass().getSimpleName(); // Get the class name
            pass_array_().put(element_name, object);
        }
    }


//    default LinkedHashMap<String, Object> pass_download() {
//        return pass_array_;
//    }

 */
}
