package src.basic_03;

public class lab25 {
    public static void main(String[] args){

        int a = 67;
        boolean b = (a>28 && a <78);
        System.out.println(b);

        boolean c = !(a>28 && a<78);
        System.out.println(c);

        boolean d = (a>28 || a <78);
        System.out.println(d);

        boolean e = !(a>28 || a <78);
        System.out.println(e);
    }
}
