package src.basic_04;

import java.util.Scanner;

public class lab55 {

    //✅ Triangle Classifier:
    //
    //   Write a program that classifies a triangle based on its side lengths.
    //   Given three input values representing the lengths of the sides, determine

    //   if the triangle is equilateral (all sides are equal),
    //   isosceles (exactly two sides are equal), or
    //   scalene (no sides are equal).
    //   Use an if-else statement to classify the triangle.


    //  side 1, side 2, side 3 ->  side1 == side 2 == side 3 ->  equilatera
    // (side1 == side 2) or side 2 == side 3 -> isosceles
    // scalene


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();

        if (s1 == s2 && s2== s3 && s3==s1){
            System.out.println("It is an equilateral triangle");
        }
        else if((s1==s2 )|| (s2==s3 )|| (s3==s1) ){
            System.out.println("It is an isosceles triangle");
        }
        else{
            System.out.println("It is an scalar triangle");
        }
    }
}
