package handlers;

public class LineScanner {
    public static String get_line() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String line = scanner.nextLine();
        return line;
    }
}