package objects.commands;

import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;

public class Show extends Command {

    public Show(CommandHandler command_handler) {
        super("show");
        set_command_description("");
        set_command_handler(command_handler);
    }
}
