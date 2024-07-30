package execution_handlers;

import objects.Product.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class ManualJsonWriter {

    public static void write_json(LinkedHashMap<Integer, Product> products, String filename) {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n\"products\": [\n");  // Start of JSON object and array

        boolean first = true;
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            if (!first) {
                jsonBuilder.append(",\n");  // Comma between JSON objects in the array
            }
            Product product = entry.getValue();
            jsonBuilder.append(String.format(
                    "\t{\"key\": %d, \"name\": \"%s\", \"price\": %.2f}",
                    entry.getKey(),
                    product.toString().replace("\"", "\\\""),  // Escape quotes in JSON string values
                    product.get_price()
            ));
            first = false;
        }

        jsonBuilder.append("\n]\n}");  // End of array and JSON object

        // Writing JSON string to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(jsonBuilder.toString());
            System.out.println("JSON data has been written to " + filename);
        } catch (IOException e) {
            System.err.println("An error occurred while writing JSON data to file: " + e.getMessage());
        }
    }
}
