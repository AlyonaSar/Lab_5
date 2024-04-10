package objects.abstract_objects;

import execution_handlers.ProgrammingHelpie;

import java.util.ArrayList;
import java.util.List;

public interface IObservable {
    List<IObserver> observers_list = new ArrayList<>();

    default void add(IObserver observer) {
//        observers_list.add(observer);
//        ProgrammingHelpie.comment("Adding new observer to product list, "
//                + observers_list.get(observers_list.size() - 1).toString());
    }

    default void remove(IObserver observer) {
//        observers_list.remove(observer);
    }

    default void notify_all() {}
}
