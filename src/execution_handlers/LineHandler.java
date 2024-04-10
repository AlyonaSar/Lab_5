package execution_handlers;

import objects.Product.ProductLHMHandler;
import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;
import objects.commands.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;


public class LineHandler {
    private LinkedHashMap<String, Command> command_list_;
    public LineHandler(AllCommandsListHandler command_list_handler) {
        command_list_ = command_list_handler.get_list();
        ProgrammingHelpie.comment("LineHandler sees the command list as: " + command_list_.toString());
    }

    private Command identify(String line) throws NoSuchCommandFoundException {
        if(command_list_.containsKey(line)) {
            ProgrammingHelpie.comment("Command found");
            Command command = command_list_.get(line);
            ProgrammingHelpie.comment("Command set to: " + command.ToString());
            return command;
        } else {
            throw new NoSuchCommandFoundException("No such command found. Write 'help' to see the list of commands");
        }
    }

    public void handle(String line) {
        ProgrammingHelpie.comment("Got in to the execute method successfully");
        String[] input_array = line.split("\\s+");
        try {
            ProgrammingHelpie.comment("Trying to identify the command");
            Command command = identify(input_array[0]);
            CommandHandler runnable = command.get_handler();
            ProgrammingHelpie.comment("Handler set to: " + runnable.getClass().getSimpleName());
            ProgrammingHelpie.comment("Trying to run the command");
            runnable.run(input_array);
        } catch (NoSuchCommandFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    class NoSuchCommandFoundException extends RuntimeException {
        NoSuchCommandFoundException(String message) {
            super(message);
        }
    }
}