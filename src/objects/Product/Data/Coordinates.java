package objects.Product.Data;

import objects.abstract_objects.Value;

public class Coordinates  extends Value {
    private int x_; //Значение поля должно быть больше -444
    private Integer y_; //Значение поля должно быть больше -402, Поле не может быть null

    public Coordinates(int x, Integer y){
        super("Coordinates");
        this.x_ = x;
        this.y_ = y;
    }
}
