public class ClearScreen {
    public static void Clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
