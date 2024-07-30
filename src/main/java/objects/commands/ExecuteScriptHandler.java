package objects.commands;

import execution_handlers.FileReadHandler;
import execution_handlers.InteractionHandler;
import execution_handlers.LineGetter;
import objects.abstract_objects.*;

public class ExecuteScriptHandler extends CommandHandler implements IObserver, Passer {
    // execute_script C:\Users\Alena\Desktop\commands.txt
    private Space space_;
    public ExecuteScriptHandler(String space_name) {
        set_space(space_name);
    }
    @Override
    public void run(String[] input_array) throws InvalidParameterException {
        LineGetter lineGetter_ = space_.get_object(InteractionHandler.class).get_line_getter();
        lineGetter_.read(input_array[1]);
    }
    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
