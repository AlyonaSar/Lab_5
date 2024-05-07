package objects.commands;

import execution_handlers.FileReadHandler;
import execution_handlers.LineHandler;
import execution_handlers.ProgrammingHelpie;
import objects.Product.ProductLHMHandler;
import objects.abstract_objects.CommandHandler;
import objects.abstract_objects.IObservable;
import objects.abstract_objects.IObserver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExecuteScriptHandler extends CommandHandler implements IObserver {
    private ProductLHMHandler productLHMHandler_;
    private FileReadHandler fileReadHandler_;
    public void set_file_read_handler(FileReadHandler fileReadHandler) {
        fileReadHandler_ = fileReadHandler;
    }
    ExecuteScriptHandler(IObservable productLHMHandler, Object fileReadHandler) {
        productLHMHandler_ = (ProductLHMHandler) productLHMHandler;
        fileReadHandler_ = (FileReadHandler) fileReadHandler;
        ProgrammingHelpie.comment("Inside ExecuteScript - set fileReadHandler to: " + fileReadHandler_);
    }
    @Override
    public void run(String[] input_array) throws InvalidParameterException {
        fileReadHandler_.handle(input_array);
    }
}
