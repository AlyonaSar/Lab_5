package objects.commands;

import objects.abstract_objects.Command;

public class Help extends Command {
    public Help() {
        super("help");
        set_command_run_line("// Displaying help for available commands");
    }
}
