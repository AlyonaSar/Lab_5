package objects.commands;

import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;

public class Help extends Command {

    public Help(CommandHandler command_handler) {
        super("help");
        set_command_description("displays descriptions for available commands");
        set_command_handler(command_handler);
    }

}
