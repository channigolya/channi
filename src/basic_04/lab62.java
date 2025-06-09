package src.basic_04;

public class lab62 {
    public static void main(String[] args){
        int itemCode = 002;
        switch (itemCode){
            case 001, 002, 003:
                System.out.println("It's an electric gadget !");
            case 004, 005:
                System.out.println("Its a mechanical device");
            default:
                System.out.println("Its a software product");
        };

    }
}
