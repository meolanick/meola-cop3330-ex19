/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        double height;
        double weight;
        double bmi;

        System.out.println( "What is your height in inches: " );
        height = scan.nextDouble();

        System.out.println("What is your weight in pounds: ");
        weight = scan.nextDouble();

        bmi = ( weight / (height * height) ) * 703;

        if(bmi < 18.5 )
        {
            System.out.printf("BMI is %.2f.\n", bmi );
            System.out.println("You are under weight.");
        }
        if( bmi >= 18.5 && bmi <= 25 )
        {
            System.out.printf("BMI is %.2f.\n", bmi );
            System.out.println("You are withing the ideal weight range.");
        }
        if( bmi > 25 )
        {
            System.out.printf("BMI is %.2f.\n", bmi );
            System.out.println("You are over weight. You should see your doctor.");
        }
    }
}
