package objects.commands;

import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;

public class Insert extends Command {

    public Insert(CommandHandler command_handler) {
        super("insert");
        set_command_description("");
        set_command_handler(command_handler);
    }

}
