package execution_handlers;

import objects.abstract_objects.Command;
import objects.abstract_objects.CommandHandler;
import objects.abstract_objects.Passer;
import objects.abstract_objects.Space;
import objects.commands.*;

import javax.sound.sampled.Line;
import java.util.LinkedHashMap;


public class LineHandler implements Passer {
    private Space space_;

    public LineHandler(String space_name) {
        set_space(space_name);
    }

    private Command identify(String line) throws NoSuchCommandFoundException {
        AllCommandsListHandler command_list_handler_ = this.space_.get_object(AllCommandsListHandler.class);
        LinkedHashMap<String, Command> command_list_ = command_list_handler_.get_list();

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

    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }

    class NoSuchCommandFoundException extends RuntimeException {
        NoSuchCommandFoundException(String message) {
            super(message);
        }
    }
}