package objects.commands;

import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;

public class RemoveLowerKey extends Command {

    public RemoveLowerKey(CommandHandler command_handler) {
        super("remove_lower_key");
        set_command_description("");
        set_command_handler(command_handler);
    }

}
