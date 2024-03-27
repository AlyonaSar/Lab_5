package handlers;

import objects.commands.ActivateCommand;

public class CommandHandler {
    public static void handle_command(ActivateCommand command) {
        command.execute();
    }


}
