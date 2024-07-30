package objects.commands;

import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;

public class RemoveGreaterKey extends Command {

    public RemoveGreaterKey(CommandHandler command_handler) {
        super("remove_greater_key");
        set_command_description("");
        set_command_handler(command_handler);
    }

}
