package objects.abstract_objects;

import execution_handlers.ProgrammingHelpie;

import java.util.ArrayList;
import java.util.List;

public interface IObservable extends Passer {
    List<IObserver> observers_list = new ArrayList<>();

    default void add(IObserver observer) {
        observers_list.add(observer);
        ProgrammingHelpie.comment("Adding new observer to something, "
                + observers_list.get(observers_list.size() - 1));
    }

    default void remove(IObserver observer) {
//        observers_list.remove(observer);
    }

    default void notify_all() {
        for (IObserver observer : observers_list) {
            observer.update();
        }
    }
}
