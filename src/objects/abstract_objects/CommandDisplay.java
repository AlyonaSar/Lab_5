package objects.abstract_objects;

import execution_handlers.LineScanner;
import execution_handlers.ProgrammingHelpie;

import java.util.Scanner;

public interface CommandDisplay extends Setter, Passer {
    String additional_begin_line_ = ">>> ";

    default void program_print(String line) {
        System.out.println(additional_begin_line_ + line);
    }

    default String program_ask(String line, LineScanner lineScanner) {
        System.out.println(additional_begin_line_ + line);
        String answer = lineScanner.get_line();
        ProgrammingHelpie.comment("The registered answer is: " + answer);
        return answer;
    }

}
