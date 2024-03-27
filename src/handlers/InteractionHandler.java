package handlers;

import objects.commands.ActivateCommand;

public class InteractionHandler {
    private static LineScanner linescanner;
    private static ActivateCommand reusableCommand = new ActivateCommand();
    public static void run_interaction() {
        System.out.println("*** Started interaction");
        while(true) {
            reusableCommand.set_command_line(linescanner.get_line());
            CommandHandler.handle_command(reusableCommand);
            System.out.println("*** Command execution complete");
        }
    }


}
