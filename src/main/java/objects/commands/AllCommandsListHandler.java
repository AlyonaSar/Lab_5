package objects.commands;

import execution_handlers.ProgrammingHelpie;
import objects.abstract_objects.Command;
import objects.abstract_objects.Passer;
import objects.abstract_objects.Space;

import java.util.LinkedHashMap;

public class AllCommandsListHandler implements Passer {
    private Space space_;
    private LinkedHashMap<String, Command> command_list_ = new LinkedHashMap<>();

    public AllCommandsListHandler(String space_name) {
        set_space(space_name);
        set_command_list();
    }

    public void set_command_list() {

        ProgrammingHelpie.comment("Setting the list of commands");

        Help help = new Help(new HelpHandler(space_.toString()));
        Info info = new Info(new InfoHandler(space_.toString()));
        Show show = new Show(new ShowHandler(space_.toString()));
        Insert insert = new Insert(new InsertHandler(space_.toString()));
        Update update = new Update(new UpdateHandler(space_.toString()));
        RemoveKey removeKey = new RemoveKey(new RemoveKeyHandler(space_.toString()));
        Clear clear = new Clear(new ClearHandler(space_.toString()));
        ExecuteScript executeScript = new ExecuteScript(new ExecuteScriptHandler(space_.toString()));
        Save save = new Save(new SaveHandler(space_.toString()));
        Exit exit = new Exit(new ExitHandler());
        RemoveLower removeLower = new RemoveLower(new RemoveLowerHandler(space_.toString()));
        RemoveGreaterKey removeGreaterKey = new RemoveGreaterKey(new RemoveGreaterKeyHandler(space_.toString()));
        RemoveLowerKey removeLowerKey = new RemoveLowerKey(new RemoveLowerKeyHandler(space_.toString()));
        RemoveAllByUnitOfMeasure removeAllByUnitOfMeasure =
                new RemoveAllByUnitOfMeasure(new RemoveAllByUnitOfMeasureHandler(space_.toString()));
        SumOfPrice sumOfPrice = new SumOfPrice(new SumOfPriceHandler(space_.toString()));
        FilterLessThanOwner filterLessThanOwner = new FilterLessThanOwner(new FilterLessThanOwnerHandler());

        addCommand(help);
        addCommand(info);
        addCommand(show);
        addCommand(insert);
        addCommand(update);
        addCommand(removeKey);
        addCommand(clear);
        addCommand(executeScript);
        addCommand(save);
        addCommand(exit);
        addCommand(removeLower);
        addCommand(removeGreaterKey);
        addCommand(removeLowerKey);
        addCommand(removeAllByUnitOfMeasure);
        addCommand(sumOfPrice);
        addCommand(filterLessThanOwner);

        ProgrammingHelpie.comment(command_list_.toString());
    }

    public LinkedHashMap<String, Command> get_list() {
        return command_list_;
    }

    public void addCommand(Command command) {
        command_list_.put(command.ToString(), command);
    }

    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
