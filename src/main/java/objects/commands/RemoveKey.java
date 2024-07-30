package objects.commands;

import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;

public class RemoveKey extends Command {

    public RemoveKey(CommandHandler command_handler) {
        super("remove_key");
        set_command_description("removes an element from the list at the position of a certain key");
        set_command_handler(command_handler);
    }

}
