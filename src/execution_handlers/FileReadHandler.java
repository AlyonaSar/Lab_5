package execution_handlers;

import objects.abstract_objects.Passer;
import objects.abstract_objects.Runnable;
import objects.abstract_objects.Space;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadHandler implements Passer {
    private Space space_;
    public FileReadHandler(String space_name) {
        set_space(space_name);
    }

    public void handle(String[] input_array) throws Runnable.InvalidParameterException {
        String fileName = input_array[1];
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            LineHandler lineHandler_ = space_.get_object(LineHandler.class);
            while ((line = reader.readLine()) != null) {
                lineHandler_.handle(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
