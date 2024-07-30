package objects.commands;

import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;

public class Exit extends Command {
    public Exit(CommandHandler command_handler) {
        super("exit");
        set_command_description("closes the program");
        set_command_handler(command_handler);
    }
}
