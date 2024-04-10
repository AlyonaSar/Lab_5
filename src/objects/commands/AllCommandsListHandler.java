package objects.commands;

import execution_handlers.ProgrammingHelpie;
import objects.Product.ProductLHMHandler;
import objects.abstract_objects.Command;
import objects.abstract_objects.IObservable;

import java.util.LinkedHashMap;

public class AllCommandsListHandler implements IObservable {

    private LinkedHashMap<String, Command> command_list_ = new LinkedHashMap<>();

    public AllCommandsListHandler(ProductLHMHandler productLHMHandler) {

        ProgrammingHelpie.comment("Setting the list of commands");

        Help help = new Help(new HelpHandler(this));
        Info info = new Info(new InfoHandler(productLHMHandler));
        Show show = new Show(new ShowHandler(productLHMHandler));
        Insert insert = new Insert(new InsertHandler(productLHMHandler));
        Update update = new Update(new UpdateHandler());
        RemoveKey removeKey = new RemoveKey(new RemoveKeyHandler());
        Clear clear = new Clear(new ClearHandler());
        ExecuteScript executeScript = new ExecuteScript(new ExecuteScriptHandler());
        Save save = new Save(new SaveHandler());
        Exit exit = new Exit(new ExitHandler());
        RemoveLower removeLower = new RemoveLower(new RemoveLowerHandler());
        RemoveGreaterKey removeGreaterKey = new RemoveGreaterKey(new RemoveGreaterKeyHandler());
        RemoveLowerKey removeLowerKey = new RemoveLowerKey(new RemoveLowerKeyHandler());
        RemoveAllByUnitOfMeasure removeAllByUnitOfMeasure = new RemoveAllByUnitOfMeasure(new RemoveAllByUnitOfMeasureHandler());
        SumOfPrice sumOfPrice = new SumOfPrice(new SumOfPriceHandler());
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

//        ProgrammingHelpie.comment(command_list_.toString());
        notify_all();
    }

    public LinkedHashMap get_list() {
        return command_list_;
    }

    public void addCommand(Command command) {
        command_list_.put(command.ToString(), command);
    }
}
