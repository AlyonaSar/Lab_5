package execution_handlers;

import objects.Product.ProductLHMHandler;
import objects.commands.AllCommandsListHandler;

public class RunInteractionHandler {
    private LineScanner linescanner_ = new LineScanner();

    public void run_interaction() {
        ProgrammingHelpie.comment("Started interaction");
        String reusableLine_;
        LineHandler linehandler_ = new LineHandler(new AllCommandsListHandler(new ProductLHMHandler()));
        while(true) {
            reusableLine_ = linescanner_.get_line();
            linehandler_.handle(reusableLine_);
            ProgrammingHelpie.comment("Command execution complete");
        }
    }


}
