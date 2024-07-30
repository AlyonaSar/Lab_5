package objects.commands;

import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;

public class FilterLessThanOwner extends Command {
    public FilterLessThanOwner(CommandHandler command_handler) {
        super("filter_less_than_owner");
        set_command_description("");
        set_command_handler(command_handler);
    }
}
