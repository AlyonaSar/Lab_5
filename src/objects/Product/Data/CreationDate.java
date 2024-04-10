package objects.Product.Data;

import objects.abstract_objects.Value;
import java.time.LocalDateTime;

public class CreationDate extends Value {
    private LocalDateTime creationDate_ = LocalDateTime.now();

    public CreationDate() {
        super("Creation date");
        set_value(creationDate_);
    }
    public CreationDate(java.time.LocalDateTime creationDate) {

        super("Creation date");
        set_value(creationDate);
    }
}
