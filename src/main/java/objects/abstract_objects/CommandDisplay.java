package objects.abstract_objects;

import execution_handlers.ProgrammingHelpie;

public interface CommandDisplay extends Setter, Passer {
    String additional_begin_line_ = ">>> ";

    default void print(String line) {
        System.out.println(additional_begin_line_ + line);
    }
}
