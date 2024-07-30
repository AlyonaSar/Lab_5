package objects.commands;

import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;

public class RemoveLower extends Command {

    public RemoveLower(CommandHandler command_handler) {
        super("remove_lower");
        set_command_description("");
        set_command_handler(command_handler);
    }

}
