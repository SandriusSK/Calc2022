package ie.atu.week4;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class Example
{
    public static void main(String[] args)
    {
        subtract();
    }

    public static void subtract()
    {
        System.out.println("Write your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Write your secondNumber :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("The total is " + total);
    }
}
