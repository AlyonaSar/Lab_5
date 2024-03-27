package objects.Person;

import objects.Person.Data.*;
public class Person {
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
}
