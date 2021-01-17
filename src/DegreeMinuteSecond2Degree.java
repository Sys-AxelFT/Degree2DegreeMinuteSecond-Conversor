import java.util.Scanner;

public class DegreeMinuteSecond2Degree {

    public void DMS2D(){

        Scanner in = new Scanner(System.in);

        float degree = in.nextFloat();
        float minute = in.nextFloat();
        float second = in.nextFloat();

        float a = degree / 1;
        float b = minute / 60;
        float c = second / 3600;

        float total = a + b + c;

        System.out.println(total + "°");

        new MainMenu().program();
    }
}
