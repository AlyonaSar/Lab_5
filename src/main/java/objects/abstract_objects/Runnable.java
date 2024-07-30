package objects.abstract_objects;

public interface Runnable extends CommandDisplay {

    default void run(String[] input_array) throws InvalidParameterException, ArrayIndexOutOfBoundsException {
        print("Doing something...");
    }

    class InvalidParameterException extends RuntimeException {
        public InvalidParameterException() {super("Invalid command usage. Write 'help' to see the list of commands and tips for usage.");}
        InvalidParameterException(String message) {
            super(message);
        }
    }
}
