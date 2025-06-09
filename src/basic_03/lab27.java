package src.basic_03;

public class lab27 {
    public static void main(String[] args){
        byte b =10;
        //casting -> molding

        //implicit type casting
        int a = b; // or
        int c = (int)b; // explicit

        // narrowing s the process of converting the higher datatype into the lower data type.
        int a1 = 300;
        byte b1= (byte)a1;   // Explicit casting
        System.out.println(b1);




    }
}
