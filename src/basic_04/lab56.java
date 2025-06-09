package src.basic_04;

import java.util.Scanner;

public class lab56 {
    public static void main(String[] args){

        //if,switch - conditional statement
        // loops-which will repeat sometimes - for while  and do while

        //switch-condition based - multi condition

        //which day is today ?
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number 1- 7 , i will tells which day it will be");

        int daynumber = sc.nextInt();
        switch (daynumber){
            case 1 :
                System.out.println("Mon");
                break;
            case 2 :
                System.out.println("Tue");
            case 3 :
                System.out.println("Wed");
            case 4 :
                System.out.println("Thu");
            case 5 :
                System.out.println("Fri");
            case 6 :
                System.out.println("Sat");
            case 7 :
                System.out.println("Sun");
            default:
                System.out.println("no day");


        }
    }
}
