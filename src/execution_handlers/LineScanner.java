package execution_handlers;

public class LineScanner {
    public String get_line() {
        System.out.print("--> ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String line = scanner.nextLine();
        return line;
    }
}