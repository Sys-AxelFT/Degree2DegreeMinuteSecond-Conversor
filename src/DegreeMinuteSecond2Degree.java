import java.util.Scanner;

public class DegreeMinuteSecond2Degree {

    public void DMS2D(){
        Utils.ClearScreen();

        Scanner in = new Scanner(System.in);

        System.out.printf("Enter value (degrees minutes seconds): ");

        float degree = in.nextFloat();
        float minute = in.nextFloat();
        float second = in.nextFloat();

        float a = degree / 1;
        float b = minute / 60;
        float c = second / 3600;

        float total = a + b + c;

        System.out.println(total + "°\n");

        Utils.Pause();
    }
}
