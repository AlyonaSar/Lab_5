package objects.Product.Data;

import objects.abstract_objects.Value;

public class CreationDate extends Value {
    private java.time.LocalDateTime creationDate_;

    public CreationDate(java.time.LocalDateTime creationDate) {

        super("Creation date");
        this.creationDate_ = creationDate;
    }
}
