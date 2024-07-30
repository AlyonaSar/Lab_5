package objects.commands;

import objects.abstract_objects.*;

import java.util.LinkedHashMap;

public class HelpHandler extends CommandHandler implements IObserver, Passer {
    private Space space_;
    private LinkedHashMap command_list_;
    private AllCommandsListHandler allCommandsListHandler_;


    public HelpHandler(String space_name) {
        set_space(space_name);
    }

    public void set_command_list(LinkedHashMap command_list) {
        this.command_list_ = command_list;
    }

    @Override
    public void run(String[] input_array) throws InvalidParameterException {
        if(input_array.length != 1) {
            throw new InvalidParameterException();
        } else {
            allCommandsListHandler_ = space_.get_object(AllCommandsListHandler.class);
            for (Object command_name :  allCommandsListHandler_.get_list().keySet()) {
                Command command = (Command) allCommandsListHandler_.get_list().get(command_name);
                print("Command " + command_name.toString() + ": "
                        + command.get_command_description());
            }
        }
    }

    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
