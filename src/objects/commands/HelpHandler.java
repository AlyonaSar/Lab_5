package objects.commands;

import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;
import objects.abstract_objects.IObservable;
import objects.abstract_objects.IObserver;

public class HelpHandler extends CommandHandler implements IObserver {

    private AllCommandsListHandler allCommandsListHandler_;

    public HelpHandler(IObservable allCommandsListHandler) {
        become_observer(allCommandsListHandler);
        allCommandsListHandler_ = (AllCommandsListHandler) allCommandsListHandler;
    }

    @Override
    public void run(String[] input_array) throws InvalidParameterException {
        if(input_array.length != 1) {
            throw new InvalidParameterException();
        } else {
            for (Object command_name :  allCommandsListHandler_.get_list().keySet()) {
                Command command = (Command) allCommandsListHandler_.get_list().get(command_name);
                program_print("Command " + command_name.toString() + ": "
                        + command.get_command_description());
            }
        }
    }
}
