package execution_handlers;

import objects.abstract_objects.CommandDisplay;
import objects.abstract_objects.Passer;
import objects.abstract_objects.Space;

public class InteractionHandler implements CommandDisplay, Passer {
    private Space space_;
    private LineGetter lineGetter_;
    private LineProcessor lineProcessor_;
    String additional_begin_line_ = ">>> ";
    public InteractionHandler(String space_name) {
        set_space(space_name);
        lineProcessor_ = new LineProcessor(space_name);
        lineGetter_ = new LineGetter(space_name);
    }
    public void interact() {
        String line = lineGetter_.get_line();
        lineProcessor_.handle(line);
        ProgrammingHelpie.comment("Command execution complete");
    }
    public String ask(String line) {
        String answer = lineGetter_.get_line(line);
        ProgrammingHelpie.comment("The registered answer is: " + answer);
        return answer;
    }
    public LineProcessor get_line_processor() {return lineProcessor_;}
    public LineGetter get_line_getter() {return lineGetter_;}
    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
