package objects.abstract_objects;

public interface IObserver {
    default void become_observer(IObservable object) {
        object.add(this);
    }

    default void update() {}
}
