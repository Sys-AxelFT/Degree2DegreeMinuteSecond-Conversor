import java.util.Scanner;

public class MainMenu {
    public void program(){

        Scanner in = new Scanner(System.in);

        System.out.println("-= MAIN MENU =-");
        System.out.println("option 1: Degree2DegreeMinuteSecond\n" +
                "option 2: DegreeMinuteSecond2Degree");

        int userAnswer = in.nextInt();

        System.out.println("-= MAIN MENU =-");

        if(userAnswer == 1){
            new Degree2DegreeMinuteSecond().D2DMS();
        } else if(userAnswer == 2){
            new DegreeMinuteSecond2Degree().DMS2D();
        } else {
            System.out.println("ERROR: THAT IS NOT AN OPTION, TRY AGAIN");
        }

    }
}
