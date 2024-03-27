package objects.Product;

import objects.Product.Data.Coordinates;
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


    public Product(
            ID id,
            Name name,
            Coordinates coordinates,
            CreationDate creationDate,
            Price price,
            UnitOfMeasure unitOfMeasure,
            Person owner) {

        this.id_ = id;
        this.name_ = name;
        this.coordinates_ = coordinates;
        this.creationDate_ = creationDate;
        this.price_ = price;
        this.unitOfMeasure_ = unitOfMeasure;
        this.owner_ = owner;
    }
}
