import {discord, Client} from "discord.js";
import java.lang.Math;
import java.util.Scanner;

public class EasyMath {
    private int number;
    private int number2;

    //basic addition methods
    public int add(int number, int number2){
        return number + number2;
    }

    //basic subtraction
    public int subtract(int number, int number2){
        return number1 - number2;
    }

    //basic multiplication
    public int mutliply(int number, int number2){
        return number1 * number2;
    }

    //basic division
    public int divide(int number, int number2){
        if(number2 != 0){
            return number / number2;
        }
        else{
            return null;
        }
    }
    //square roots the number
    public double root(int number){
        return Math.sqrt(number);
    }

}