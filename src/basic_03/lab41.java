package src.basic_03;

public class lab41 {
    public static void main (String[] args){
        int a = 10;
        System.out.println(++a + a++ + a++);

        //Part 1 = Exp=11, a=11 -> o/p = 11
        //Part 1 = Exp=11, a=12 -> o/p = 11
        //Part 1 = Exp=12, a=13 -> o/p = 12
    }
}
