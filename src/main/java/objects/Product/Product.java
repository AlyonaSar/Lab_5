package objects.Product;

import objects.Person.PersonHandler;
import objects.Product.Data.*;

import java.sql.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Product {

    private ID id_;
    // Поле не может быть null, Значение поля должно быть больше 0.
    // Значение этого поля должно быть уникальным
    // Значение этого поля должно генерироваться автоматически

    private Name name_;
    // Поле не может быть null
    // Строка не может быть пустой

    private Coordinates coordinates_;
    // Поле не может быть null

    private CreationDate creationDate_;
    // Поле не может быть null
    // Значение этого поля должно генерироваться автоматически

    private Price price_;
    // Поле может быть null
    // Значение поля должно быть больше 0

    private UnitOfMeasure unitOfMeasure_;
    // Поле не может быть null

    private PersonHandler person_handler_;
    // Поле не может быть null


//    public Product(ID id, Name name, Coordinates coordinates, CreationDate creationDate, Price price, UnitOfMeasure unitOfMeasure, PersonHandler ownerHandler) {}
//        this.id_ = new ID(last_id + 1); // задаем генератором
// name
//        this.coordinates_ = coordinates;
//        this.creationDate_ = creationDate;
//        this.price_ = price;
//        this.unitOfMeasure_ = unitOfMeasure;
//        this.owner_ = owner;
//         узнать все остальные характеристики, начать их спрашивать


    public Product(
            ID id,
            Name name,
            Coordinates coordinates,
            CreationDate creationDate,
            Price price,
            UnitOfMeasure unitOfMeasure,
            PersonHandler person_handler
            ) {

        this.id_ = id;
        this.name_ = name;
        this.coordinates_ = coordinates;
        this.creationDate_ = creationDate;
        this.price_ = price;
        this.unitOfMeasure_ = unitOfMeasure;
        this.person_handler_ = person_handler;
    }

    public void set_id(ID id) {
        this.id_ = id;
    }
    public Long get_id() {
        return (long) id_.get_value();
    }
    public String toString() {
        return (String) name_.get_value();
    }
    public List get_coordinates() {
        return (List) coordinates_.get_value();
    }
    public LocalDateTime get_creation_date() {
        return (LocalDateTime) creationDate_.get_value();
    }

    public Long get_price() {
        return (Long) price_.get_value();
    }

    public UnitOfMeasure get_unit_of_measure() {
        return unitOfMeasure_;
    }

    public PersonHandler get_person_handler() {
        return person_handler_;


    }
}
