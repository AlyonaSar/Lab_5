package objects.abstract_objects;

import execution_handlers.LineScanner;
import execution_handlers.ProgrammingHelpie;

public interface CommandDisplay {

    String additional_begin_line_ = ">>> ";

    default void program_print(String line) {
        System.out.println(additional_begin_line_ + line);
    }

    default String program_ask(String line) {
        System.out.println(additional_begin_line_ + line);
        String answer = LineScanner.get_line();
        ProgrammingHelpie.comment("The registered answer is: " + answer);
        return answer;
    }
}
