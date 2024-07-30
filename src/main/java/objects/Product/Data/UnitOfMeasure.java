package objects.Product.Data;

import objects.abstract_objects.Value;

import java.util.Arrays;
import java.util.stream.Collectors;

public enum UnitOfMeasure {

    KILOGRAMS("kg"),
    METERS("m"),
    SQUARE_METERS("m2"),
    MILLILITERS("ml");

    private final String value_;
    public static String get_values() {
        return Arrays.stream(UnitOfMeasure.values())
                .map(UnitOfMeasure::getValue)
                .collect(Collectors.joining(", "));
    }

    UnitOfMeasure(String value) {
        this.value_ = value;
    }

    public String getValue() {
        return value_;
    }

    public static UnitOfMeasure fromString(String text) {
        for (UnitOfMeasure unit : UnitOfMeasure.values()) {
            if (unit.value_.equalsIgnoreCase(text)) {
                return unit;
            }
        }
        throw new IllegalArgumentException("No constant with value " + text + " found");
    }
}
