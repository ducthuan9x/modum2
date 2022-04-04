import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int a;
        Scanner nhapa =new Scanner(System.in);
        System.out.println("nhập số a");
        a= nhapa.nextInt();
        if(a%2==0){
            System.out.println("a là số chẵn");
        } else{
            System.out.println("a là số lẻ");
        }
    }
}

