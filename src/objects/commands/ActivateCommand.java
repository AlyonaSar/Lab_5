package objects.commands;

import objects.abstract_objects.Command;

import java.util.LinkedHashMap;

// можно при создании ActivateCommand задавать названия командам
// (можно будет лего поменять в будущем, если понадобится)

public class ActivateCommand {
    private String command_line_;
    private LinkedHashMap<String, Command> command_list = new LinkedHashMap<>();
    public ActivateCommand() {
        set_command_list();
    }

    public void set_command_line(String line) {
        this.command_line_ = line;
    }

    public String get_command_line() {
        return this.command_line_;
    }

    private void set_command_list() { // переместить в отдельный класс? + возмоность изменять команды
        System.out.println("*** Setting list of command names");
        Help help = new Help();
        Clear clear = new Clear();
        // ...

        command_list.put(help.get_command_name(), help);
        command_list.put(clear.get_command_name(), clear);
        // ...
        System.out.println("*** " + command_list);
    }

    private void identify() throws NoSuchCommandFoundException {
//        switch(get_command_line()) { // ощущение, словно это можно сделать легче, как-то через список
//            case "help":
//                // Help.execute(command_);
//                break;
//            case "info":
//                // Info.execute(command_);
//                break;
//            case "show":
//                // Show.execute(command_);
//                break;
//            case "insert null":
//                // InsertNull.execute(command_);
//                break;
//            case "update id":
//                // UpdateID.execute(command_);
//                break;
//            case "clear":
//                // Clear.execute(command_);
//                break;
//            case "execute_script file_name":
//                // ExecuteScript.execute(command_);
//                break;
//            case "exit":
//                // Exit.execute(command_);
//                break;
//            case "remove_lower":
//                // RemoveLower.execute(command_);
//                break;
//            case "remove_greater_key_null":
//                // RemoveGreaterKeyNull.execute(command_);
//                break;
//            case "remove_lower_key_null":
//                // RemoveLowerKeyNull.execute(command_);
//                break;
//            case "remove_all_by_unit_of_measure unitOfMeasure":
//                // RemoveAllByUnitOfMeasure.execute(command_);
//                break;
//            case "sum_of_price":
//                // SumOfPrice.execute(command_);
//                break;
//            case "filter_less_than_owner owner":
//                // FIlterLessThanOwner.execute(command_);
//                break;
//
//            default:
//                throw new NoSuchCommandFoundException("No such command found." +
//                        "Write help to see the list of commands.\n");
//        }

        if(command_list.containsKey(command_line_)) {
            // не забыть про команды с пробедом и доп инфой,
            // надо будет разделять строку
            System.out.println("*** Command found");
            Command command = command_list.get(command_line_);
            System.out.println("*** Command set to: " + command.get_command_name());
            System.out.println("*** Trying to run the command");
            command.run();
        } else {
            throw new NoSuchCommandFoundException("No such command found. " +
                    "Write help to see the list of commands.");
        }
    }

    public void execute() {
        System.out.println("*** Got in to the execute method successfully");
        try {
            System.out.println("*** Trying to identify the command");
            identify();
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