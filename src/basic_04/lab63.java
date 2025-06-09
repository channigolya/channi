package src.basic_04;

public class lab63 {
    public static void main(String[] args) {
        int itemCode = 001;
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop !");
            case 002 -> System.out.println("Its a desktop");
            case 003, 004 -> System.out.println("Its a mobile phone");
            default -> System.out.println("Its a software product");
        }
    }
}
