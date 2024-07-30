package execution_handlers;

import objects.Product.ProductLHMHandler;
import objects.abstract_objects.Passer;
import objects.abstract_objects.Space;
import objects.abstract_objects.SpaceList;
import objects.commands.AllCommandsListHandler;

public class RunInteractionHandler implements Passer {
    private Space space_;

    public RunInteractionHandler(String space_name) {
        space_ = space_list_.get_space(space_name);
        if (space_ == null) {
            throw new IllegalStateException("No space found with name: " + space_name);
        }
    }

    public void run_interaction() {
        ProgrammingHelpie.comment("Starting interaction");
        InteractionHandler interactionHandler_ = new InteractionHandler(space_.toString());
        AllCommandsListHandler allCommandsListHandler_ = new AllCommandsListHandler(space_.toString());
        ProductLHMHandler productLHMHandler_ = new ProductLHMHandler(space_.toString());
        FileReadHandler fileReadHandler_ = new FileReadHandler(space_.toString());

        space_.add_object(allCommandsListHandler_);
        space_.add_object(productLHMHandler_);
        space_.add_object(interactionHandler_);
        space_.add_object(fileReadHandler_);

        while(true) {
            interactionHandler_.interact();
        }
    }
    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
