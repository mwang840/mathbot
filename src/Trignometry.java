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

    public double tangent(double number){
        double radians = Math.toRadians(number);
        return Math.tan(radians);
    }

    public double secant(double number, double number2, double number3){

    }
}