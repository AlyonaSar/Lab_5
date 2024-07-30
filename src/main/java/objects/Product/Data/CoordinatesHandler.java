package objects.Product.Data;

import execution_handlers.ProgrammingHelpie;

public class CoordinatesHandler {
    public Coordinates handle(Object line) {
        try {
            String[] input_array = ((String) line).split("\\s+");
            Coordinates coordinates = new Coordinates(
                    Integer.parseInt(input_array[0]),
                    Integer.parseInt(input_array[1]));
            ProgrammingHelpie.comment("Coordinates are set to: " + coordinates.get_value());
            return coordinates;
        } catch (Exception e) {
            System.err.println("Error: Could not convert the input to a valid Coordinates object. Please try again.");
            return null;
        }
    }
}
