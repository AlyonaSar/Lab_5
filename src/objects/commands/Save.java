package objects.commands;

import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;

public class Save extends Command {

    public Save(CommandHandler command_handler) {
        super("save");
        set_command_description("");
        set_command_handler(command_handler);
    }

}
