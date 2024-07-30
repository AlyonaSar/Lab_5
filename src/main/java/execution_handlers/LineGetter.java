package execution_handlers;

import objects.abstract_objects.CommandDisplay;
import objects.abstract_objects.Passer;
import objects.abstract_objects.Space;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LineGetter implements CommandDisplay, Passer {
    private Space space_;
    private ArrayList<String> lineBuffer_ = new ArrayList<>();
    String additional_begin_line_ = ">>> ";
    public LineGetter(String space_name) {
        set_space(space_name);
    }
    public String get_line() {
        if (lineBuffer_.size() > 0) {
            String current_line = lineBuffer_.get(0);
            lineBuffer_.remove(0);
            return current_line;
        }
        return scan();
    }
    public String get_line(String thing) {
        print("What is the value of " + thing + "?");
        return get_line();
    }

    public String scan() {
        System.out.print("--> ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            return line;
        } else {
            return null;
        }
    }
    public void read(String file_name) {
        lineBuffer_.addAll(space_.get_object(FileReadHandler.class).read(file_name));
    }
    @Override
    public void set_space(String space_name) {
        space_ = space_list_.get_space(space_name);
    }
}