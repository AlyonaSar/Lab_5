package execution_handlers;

import objects.abstract_objects.Passer;
import objects.abstract_objects.Runnable;
import objects.abstract_objects.Space;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReadHandler implements Passer {
    private Space space_;
    public FileReadHandler(String space_name) {
        set_space(space_name);
    }

    public List<String> read(String file_name) throws Runnable.InvalidParameterException {
        ArrayList<String> lineBuffer_ = new ArrayList<>();
        String fileName = file_name;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            LineProcessor lineProcessor_ =  space_.get_object(InteractionHandler.class).get_line_processor();
            while ((line = reader.readLine()) != null) {
                lineBuffer_.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return lineBuffer_;
    }

    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}
