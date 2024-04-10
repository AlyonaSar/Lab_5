package objects.abstract_objects;

import objects.Product.ProductLHMHandler;

public class Command {
    private String command_run_line_;
    private String command_description_;
    private CommandHandler command_handler_;

    public Command(String command_run_line) {
        set_command_run_line(command_run_line);
    }
    public Command(
            String command_run_line,
            String command_description,
            CommandHandler handler) {
        set_command_run_line(command_run_line);
        set_command_description(command_description);
        set_command_handler(handler);
    }

    public String ToString() {
        return command_run_line_;
    }

    public void set_command_run_line(String command_run_line) {
        this.command_run_line_ = command_run_line;
    }

    public void set_command_description(String command_description) {
        this.command_description_ = "This command " + command_description;
    }

    public String get_command_description() {
        return command_description_;
    }

    public CommandHandler get_handler() {
        return command_handler_;
    }

    public void set_command_handler(CommandHandler handler) {
        this.command_handler_ = handler;
    }


}

