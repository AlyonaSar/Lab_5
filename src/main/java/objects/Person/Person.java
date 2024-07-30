package objects.Person;

import execution_handlers.InteractionHandler;
import execution_handlers.ProgrammingHelpie;
import objects.Person.Data.*;
import objects.Product.Data.ID;

public class Person {

    private PersonHandler handler_;
    private Name name_;
    //Поле не может быть null
    // Строка не может быть пустой
    private Birthday birthday_;
    //Поле не может быть null
    private Height height_;
    //Поле может быть null
    // Значение поля должно быть больше 0
    private PassportID passportID_;
    //Строка не может быть пустой
    // Поле может быть null

    public Person(
            Name name,
            Birthday birthday,
            Height height,
            PassportID passportID) {

        this.name_ = name;
        this.birthday_ = birthday;
        this.height_ = height;
        this.passportID_ = passportID;
    }
    @Override
    public String toString() {
        return name_.get_value().toString();
    }
    public PersonHandler get_handler() {return handler_;}
    public Birthday get_birthday() {return birthday_;}
    public Height get_height() {return height_;}
    public PassportID get_passportID() {return passportID_;}

}
