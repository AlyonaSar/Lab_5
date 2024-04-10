package objects.Product;

import objects.Person.Person;
import objects.Product.Data.*;

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

    private Person owner_;
    // Поле не может быть null


    public Product() {}
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
            Person owner
            ) {

        this.id_ = id;
        this.name_ = name;
        this.coordinates_ = coordinates;
        this.creationDate_ = creationDate;
        this.price_ = price;
        this.unitOfMeasure_ = unitOfMeasure;
        this.owner_ = owner;
    }

    public void set_id(ID id) {
        this.id_ = id;
    }
    public Object get_id() {
        return id_.get_value();
    }

    public Object get_name() {
        return name_.get_value();
    }

    public String toString() {
        return (String) get_name();
    }

    public Object get_coordinates() {
        return coordinates_.get_value();
    }

    public Object get_creation_date() {
        return creationDate_.get_value();
    }

    public Object get_price() {
        return price_.get_value();
    }

    public Object get_unit_of_measure() {
        return unitOfMeasure_;
    }

    public Object get_owner() {
        return owner_.get_name();
    }
}
