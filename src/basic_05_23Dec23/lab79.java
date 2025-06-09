package src.basic_05_23Dec23;

public class lab79 {
    public static void main(String[] args){
        //for(A;B;C)
        //A-> Initialization -> JVM What variable , where you are starting point
        //B -> Condition -> When you want this to stop -> true, false
        //C -> Increment / Decrement

        System.out.println("Print the value of i , but want to break the when i = 5 ");

        for(int i = 0;i<=10;i++){
            System.out.println("Value of i="+i);
            if (i==5)
                break;
        }
        System.out.println("End");
    }
}
