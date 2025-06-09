package src.basic_04;

import java.util.Scanner;

public class lab57 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        switch(name){
            case "chrome":
                System.out.println("Execute the chrome code");
                break;
            case "edge":
                System.out.println("Execute the edge code");
                break;
            case "opera":
                System.out.println("Execute the opera code");
                break;
            case "Safari":
                System.out.println("Execute the safari code");
                break;
            default:
                System.out.println("this is not a browser");
        }
    }
}
