package src.basic_05_23Dec23;

import java.util.Scanner;

public class lab68 {
    public static void main(String[] args){
        // 3/ x^2 +y^

        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the X");
         double x = sc.nextDouble();
        System.out.println("Enter the y ");
        double y = sc.nextDouble();
        System.out.println("Enter the value of z");
        double z = sc.nextDouble();

        double result;
         result = Math.cbrt(Math.pow(x,2)+ Math.pow(y,2)-Math
                 .abs(z));
        System.out.println(result);

    }
}
