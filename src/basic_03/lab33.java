package src.basic_03;

public class lab33 {
    public static void main(String[] args){
        String s1 = "i love to do testing";
        String s2 = "i love to do testing";

        String name = new String("i love to do testing");
        String name1 = new String ("i love to do Testing");

        System.out.println(s1 == s2);
        System.out.println(s2==name);// not same becoz one is in string constant pool another is in heap area
        System.out.println(s2.equals(name));
        System.out.println(s1.equalsIgnoreCase(name1));
    }

    }
