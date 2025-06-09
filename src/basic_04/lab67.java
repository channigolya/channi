package src.basic_04;

public class lab67 {
    public static void main(String[] args){
        char code ='B';
        int val = switch (code){
            case 'A':
               yield 65;
            case 'B':
                yield 66;
            default:
                throw new IllegalStateException("Unexpected value :"+code);
        };

    }
}
