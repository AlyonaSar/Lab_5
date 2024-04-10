package objects.Product.Data;

import execution_handlers.ProgrammingHelpie;

public class CoordinatesHandler {
    public Coordinates handle(String line) {
        String[] input_array = line.split("\\s+");
        Coordinates coordinates = new Coordinates(
                Integer.parseInt(input_array[0]),
                Integer.parseInt(input_array[1]));
        ProgrammingHelpie.comment("Coordinates are set to: " + coordinates.get_value());
        return coordinates;
    }
}
