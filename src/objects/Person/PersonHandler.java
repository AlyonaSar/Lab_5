package objects.Person;

import objects.Person.Data.*;
import objects.abstract_objects.CommandDisplay;

public class PersonHandler implements CommandDisplay {
    public Person handle() {
        program_print("Now let's set the profile for the owner");
        Name name = new NameHandler().handle(program_ask("What is the name?"));
        Birthday birthday = new BirthdayHandler().handle(program_ask("What is the Birthday date?"));
        Height height = new HeightHandler().handle(program_ask("What is the height?"));
        PassportID passportID = new PassportIDHandler().handle(program_ask("What is the passportID?"));

        Person person = new Person(
                name,
                birthday,
                height,
                passportID);
        return person;
    }
}
