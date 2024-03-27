package objects.abstract_objects;

public class Command implements Runnable {
    private String command_name_;
    private static String command_run_line_;

    public Command(String command_name) {
        set_command_name(command_name);
    }

    public void set_command_name(String command_name) {
        this.command_name_ = command_name;
    }

    public String get_command_name() {
        return command_name_;
    }

    public void set_command_run_line(String command_run_line) {
        this.command_run_line_ = command_run_line;
    }

    public static String get_command_run_line() {
        return command_run_line_;
    }

    @Override
    public void run() {
        System.out.println(command_run_line_);
    }
}
