package src.basic_05_23Dec23;

import java.util.Scanner;

public class lab69 {
    public static void main(String[] args){
        // take the user information and print the information
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your salary");
        double salary = sc.nextDouble();

        System.out.println("Yor details are "+name);
        System.out.println("Your age is "+age);
        System.out.println("Your salary is "+salary);
         sc.close();



    }
}
