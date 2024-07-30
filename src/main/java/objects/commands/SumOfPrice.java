package objects.commands;

import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;

public class SumOfPrice extends Command {

    public SumOfPrice(CommandHandler command_handler) {
        super("sum_of_price");
        set_command_description("");
        set_command_handler(command_handler);
    }

}
