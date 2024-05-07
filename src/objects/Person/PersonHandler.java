package objects.Person;

import execution_handlers.InteractionHandler;
import objects.Person.Data.*;
import objects.abstract_objects.CommandDisplay;
import objects.abstract_objects.Passer;
import objects.abstract_objects.Space;

import java.util.ArrayList;

public class PersonHandler implements CommandDisplay, Passer {
    private Space space_;
    public PersonHandler(String space_name) {
        set_space(space_name);
    }
    public Person handle() {
        /*
        program_print("Now let's set the profile for the owner");
        Name name = new NameHandler().handle(program_ask("What is the name?"));
        Birthday birthday = new BirthdayHandler().handle(program_ask("What is the Birthday date?"));
        Height height = new HeightHandler().handle(program_ask("What is the height?"));
        PassportID passportID = new PassportIDHandler().handle(program_ask("What is the passportID?"));
        */

                InteractionHandler interactionHandler_ = space_.get_object(InteractionHandler.class);
                String line = interactionHandler_.ask("name");
                Name name = new NameHandler().handle(line);
                line = interactionHandler_.ask("birthday date");
                Birthday birthday = new BirthdayHandler().handle(line);
                line = interactionHandler_.ask("height");
                Height height =  new HeightHandler().handle(line);
                line = interactionHandler_.ask("passportID");
                PassportID passportID = new PassportIDHandler().handle(line);

                return new Person(
                        name,
                        birthday,
                        height,
                        passportID);
    }

    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
