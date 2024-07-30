package objects.commands;

import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;

public class Info extends Command {

    public Info(CommandHandler command_handler) {
        super("info");
        set_command_description("displays information about the structure");
        set_command_handler(command_handler);
    }

}
