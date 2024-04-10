package objects.commands;

import objects.abstract_objects.CommandHandler;

public class ClearHandler extends CommandHandler {
    @Override
    public void run(String[] input_array)  throws InvalidParameterException {
        System.out.println("RUNNING: CLEARED THE STRUCTURE");
    }
}
