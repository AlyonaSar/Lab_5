package objects.commands;

import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;

public class Update extends Command {

    public Update(CommandHandler command_handler) {
        super("update");
        set_command_description("");
        set_command_handler(command_handler);
    }

}
