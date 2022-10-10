package ie.atu.week4;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class Example
{
    public static void main(String[] args)
    {
        System.out.println("Good Morning");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int firstNumber = input.nextInt();
        System.out.println("You entered : " + firstNumber);
        add();

    }

    //This method takes in a value and adds
    public static void add()
    {
        System.out.println("You just called a method");
    }
}
