package objects.Person;

import execution_handlers.InteractionHandler;
import execution_handlers.ProgrammingHelpie;
import objects.Person.Data.*;
import objects.abstract_objects.CommandDisplay;
import objects.abstract_objects.Passer;
import objects.abstract_objects.Space;

public class PersonHandler implements CommandDisplay, Passer {
    private Space space_;
    private Person person_;
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
                interactionHandler_.print("Creating profile for the owner");
                String line = interactionHandler_.ask("name");
                Name name = new NameHandler().handle(line);
                BirthdayHandler birthdayHandler_ = new BirthdayHandler();
                line = interactionHandler_.ask("birthday date (" + birthdayHandler_.get_format() + ")");
                Birthday birthday = birthdayHandler_.handle(line);
                line = interactionHandler_.ask("height");
                Height height =  new HeightHandler().handle(line);
                line = interactionHandler_.ask("passportID");
                PassportID passportID = new PassportIDHandler().handle(line);

                person_ = new Person(
                        name,
                        birthday,
                        height,
                        passportID);
                return get_person();
    }
    public void display(String add_line) {
        ProgrammingHelpie.comment("Successfully got into the display of person. Displaying variables down below");
        InteractionHandler printer = space_.get_object(InteractionHandler.class);
        printer.print(add_line + "     The name is: " + person_.toString());
        printer.print(add_line + "     The Birthday date is: " + person_.get_birthday().toString());
        printer.print(add_line + "     The height is: " + person_.get_height().toString());
        printer.print(add_line + "     The passport ID is: " + person_.get_passportID().toString());
    }
    public Person get_person() {
        return person_;
    }
    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
