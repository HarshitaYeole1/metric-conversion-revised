/**
 * Created by harshita on 18/8/16.
 */

import java.util.Scanner;

/**
 * Created by harshita on 14/8/16.
 */
public class MetricConversion{
    private static final double pound=0.45359237;
    private static final double inch=0.0254;
    private static final double feet=0.306;

    public static void calculateKgToPound(int number1,int number2)
    {
        System.out.println("Kilogram\t\t Pound");
        double answer=0;
        for(int i=number1;i<=number2;i++)
        {
            answer=i*pound;
            System.out.println(i+"\t\t\t\t"+ answer);
        }


    }

    public static void printTable()
    {
        System.out.println("\t\tInches");
        System.out.print("Feet\t");
        for (int i=0;i<=11;i++)
        {
            System.out.print(i+"\t\t\t");
        }
        System.out.println();
    }

    public static void calculateInchFeetToMeters()
    {
        int myinch;
        int myfeet;

        for(myfeet=0;myfeet<=9;myfeet++)
        {
            for (myinch=0;myinch<=11;myinch++)
            {

                double meters=((inch*myinch)+(feet*myfeet));

                System.out.print(myfeet+"\t\t");
                System.out.printf("%.4f",meters,"\t");

            }
            System.out.println();
        }

    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Project 2 created by Harshita.");

        System.out.println("Kilogram to Pound conversion");
        //ask range
        System.out.println("Enter number 1: ");
        int number1=sc.nextInt();
        System.out.println("Enter number 2: ");
        int number2=sc.nextInt();



        //call function to convert kilogram to pound

        calculateKgToPound(number1,number2);

        //call function to convert feet inches to meters
        System.out.println("\n\nCoversion table for feet-inch to meters");

        printTable();
        calculateInchFeetToMeters();



    }
}
