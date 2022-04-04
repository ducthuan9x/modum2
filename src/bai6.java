import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        String[] Students = {"thu", "tha", "hao", "ju","thu"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a");
        String a = scanner.nextLine();
        int count=0;
        for (int i = 0; i < Students.length; i++) {
            if (Students[i].equals(a)) {
               count++;
            }
        }
        if(count!=0){
            System.out.println(" nằm trong mảng "    + count);
        }
        else{
            System.out.println(" ko nằm trong mảng");
        }
    }
}
