package objects.commands;

import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;

public class ExecuteScript extends Command {
    public ExecuteScript(CommandHandler command_handler) {
        super("execute_script");
        set_command_description("executes a script from a certain file.The commands in the file should be the same format as in the original program");
        set_command_handler(command_handler);
    }
}
