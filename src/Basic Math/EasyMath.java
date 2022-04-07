import {discord, Client} from "discord.js";
import java.util.Scanner;

public class EasyMath {
    private int number;
    private int number2;

    public int add(int number, int number2){
        return number + number2;
    }

    public int subtract(int number, int number2){
        return number1 - number2;
    }

    public int mutliply(int number, int number2){
        return number1 * number2;
    }

    publit int divide(int number, int number2){
        if(number2 != 0){
            return number / number2;
        }
        else{
            return null;
        }
    }
}