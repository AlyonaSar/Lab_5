package execution_handlers;

import objects.abstract_objects.Passer;
import objects.abstract_objects.Space;

public class InteractionHandler implements Passer {
    private Space space_;
    String additional_begin_line_ = ">>> ";
    public InteractionHandler(String space_name) {
        set_space(space_name);
    }
    public void set_additional_begin_line(String additional_begin_line) {
        additional_begin_line_ = additional_begin_line;
    }
    public void interact() {
        String reusableLine_ = space_.get_object(LineScanner.class).get_line();
        space_.get_object(LineHandler.class).handle(reusableLine_);
        ProgrammingHelpie.comment("Command execution complete");
    }
    public String ask(String thing) {
        System.out.println(additional_begin_line_ + "What is the value of variable " + thing);
        String answer = space_.get_object(LineScanner.class).get_line();
        ProgrammingHelpie.comment("The registered answer is: " + answer);
        return answer;
    }
    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
