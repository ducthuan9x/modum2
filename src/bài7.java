import java.util.Scanner;

public class bài7 {
    public static void main(String[] args) {
//        double x = 16-2;
//        if (x < 16) {
//            System.out.println("A");
//        } else if (x < 15) {
//            System.out.println("B");
//        } else {
//            System.out.println("C");
//        }
        int a = 2 < 3 ? 2 : 3;
        switch (a) {
            case 1:
                System.out.print("A");
                break;
            case 2:
                System.out.print("B");
            default:
                System.out.print("C");
        }
    }
}

