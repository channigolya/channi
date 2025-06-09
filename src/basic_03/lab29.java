package src.basic_03;

public class lab29 {
    public static void main(String[] args){
        String s1 = "channi";
        //String constant pool

        String s2 = new String("channi");

        System.out.println(s1==s2);// check for the references
        System.out.println(s1.equals(s2));// check for the value

        // 'new' operator  is used to create the new object for the class
        // it returns the address of newly created object
        System.out.println(s2);



    }
}
