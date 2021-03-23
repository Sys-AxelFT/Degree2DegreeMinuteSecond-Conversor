import java.util.Scanner;

public class Utils {
    public static void ClearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void Pause() {
        System.out.printf("Press ENTER key to continue...");
        System.out.flush();

        try
        {
            System.in.read();
        }

        catch(Exception e)
        {
            // Do nothing
        }
    }
}
