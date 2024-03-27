package objects.abstract_objects;

public interface Runnable {
    default void run() {
        System.out.println("// running something");
    }
}
