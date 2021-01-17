import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Degree2DegreeMinuteSecond {

    public void D2DMS(){

        Scanner in = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("###.###");
        df.setRoundingMode(RoundingMode.HALF_DOWN);

        float decimal = in.nextFloat();
        int degree = (int)decimal;
        float a = decimal - degree;
        float minute = Float.parseFloat(df.format(a)) * 60;
        int b = (int)minute;
        float c = minute - b;
        float d = Float.parseFloat(df.format(c)) * 60;
        int second = (int) d;

        if(d > 59){
            second = 0;
        }

        System.out.println(degree + "° " + (int)minute + "' " + second + "''");

        new MainMenu().program();

    }

}
