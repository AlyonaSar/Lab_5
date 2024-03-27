package objects.commands;

import objects.abstract_objects.Command;

public class Clear extends Command {
    public Clear() {
        super("clear");
        set_command_run_line("// Cleared the structure");
    }
}
