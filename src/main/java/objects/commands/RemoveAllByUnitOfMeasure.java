package objects.commands;

import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;

public class RemoveAllByUnitOfMeasure extends Command {

    public RemoveAllByUnitOfMeasure(CommandHandler command_handler) {
        super("remove_all_by_unit_of_measure");
        set_command_description("");
        set_command_handler(command_handler);
    }

}
