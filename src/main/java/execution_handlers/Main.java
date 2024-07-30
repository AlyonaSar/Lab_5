package execution_handlers;


import objects.abstract_objects.Space;
import objects.abstract_objects.SpaceList;

public class Main {
    public static void main(String[] args) {
        SpaceList spaceList_ = SpaceList.getInstance();
        Space space1 = new Space("simulation1");
        spaceList_.add_space(space1);
        RunInteractionHandler interactionHandler = new RunInteractionHandler("simulation1");
        interactionHandler.run_interaction();
    }
}