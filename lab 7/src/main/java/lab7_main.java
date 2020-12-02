import Models.*;
import Services.*;

public class lab7_main {
    public static void main(String[] args) throws Exception {
        Command cmd1 = new OpenCommand();
        cmd1.execute();
        Command cmd2 = new StatisticsCommand();
        cmd2.execute();
        System.out.println("\nThe book: ");
        DocumentManager.getBook().print();
    }
}
