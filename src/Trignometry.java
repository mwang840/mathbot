import java.lang.Math;
import java.util.Scanner;

public class Trignometry{
    private double number;

    public double sin(double number){
        double radians = Math.toRadians(number);
        return Math.Sin(radians);
    }

    public double cosine(double number){
        double radians = Math.toRadians(number);
        return Math.cos(radians);
    }
}