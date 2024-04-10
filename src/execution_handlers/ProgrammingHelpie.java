package execution_handlers;

public class ProgrammingHelpie {
    static Boolean help = Boolean.TRUE;

    public static void comment(String line) {
        if(help) {
            System.out.println("--- " + line);
        }
    }
}
