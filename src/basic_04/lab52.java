package src.basic_04;

import java.util.Scanner;

public class lab52 {
    public static void main (String[] args){
        //grade calculator
        // Write a program that calculates and displays the letter grade for a given
        // numerical score (e.g. A, B, C,D,E and F ) based on the following

        //A:90-100
        //B:80-89
        //C:70-79
        //D:60-69
        //F:0-59

        // take input from the user
        // BSic login or Brute force logic write basic rough code
        //Write the real code
        // debug the code
        // Fix the code and final it

        Scanner s1 = new Scanner(System.in);
        double english = s1.nextDouble();

        Scanner s2 = new Scanner(System.in);
        double maths = s2.nextDouble();

        Scanner s3 = new Scanner(System.in);
        double hindi = s3.nextDouble();

        double percentage = ((english+maths+hindi)/300)*100;

        System.out.println(percentage);

        if (percentage <=100 && percentage >=90){
            System.out.println("Grade = A");
        }
        else if(percentage <=89 && percentage >=80){
            System.out.println("Grade = B");
        }
        else if(percentage <=79 && percentage >=70){
            System.out.println("Grade = C");
        }
        else if(percentage <=69 && percentage >=60){
            System.out.println("Grade = D");
        }
        else
            System.out.println("Grade = F ");
    }
}
