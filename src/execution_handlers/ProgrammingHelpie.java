package execution_handlers;

public class ProgrammingHelpie {
    static Boolean help_on = Boolean.TRUE;

    public static void comment(String line) {
        if(help_on) {
            System.out.println("--- " + line);
        }
    }
}
