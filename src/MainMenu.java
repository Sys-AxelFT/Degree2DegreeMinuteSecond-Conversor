import java.util.Scanner;


public class MainMenu {
    static boolean error = false;

    public void printOptions(boolean error) {
        System.out.println("-= MAIN MENU =-");
        System.out.println("option 1: Degree2DegreeMinuteSecond");
        System.out.println("option 2: DegreeMinuteSecond2Degree\n");

        if(error)
        {
          error = false;
          System.out.println("[ERROR] Invalid option. Please, try again.\n");
        }
    }

    public void program(){
        Scanner in = new Scanner(System.in);


        do {
            Utils.ClearScreen();
            printOptions(error);

            System.out.printf("I choose option: ");
            int userAnswer = in.nextInt();

            if(userAnswer == 1)
            {
                new Degree2DegreeMinuteSecond().D2DMS();
            }

            else if(userAnswer == 2)
            {
                new DegreeMinuteSecond2Degree().DMS2D();
            }

            else
            {
              error = true;
            }
        } while(true);

    }
}
