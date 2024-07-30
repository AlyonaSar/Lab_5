package objects.commands;

import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;

public class Clear extends Command {
    public Clear(CommandHandler command_handler) {
        super("clear");
        set_command_description("clears the structure");
        set_command_handler(command_handler);
    }
}
