package org.example;

import Operations.MathsOperation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator
{
    public static void main( String[] args )
    {
        try {
            MathsOperation operation = new MathsOperation();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            char operator = sc.next().charAt(0);
            try
            {
            System.out.println(operation.calculate(a, b, operator)); }
            catch (ArithmeticException e)
            {
                System.out.println("cant divide by zero");
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("wrong input");
        }
    }
}
