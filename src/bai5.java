import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner nhapab=new Scanner(System.in);
        System.out.println("nhập số a");
        a=nhapab.nextInt();
        System.out.println("nhập số b");
        b=nhapab.nextInt();
        int s=0;
        for(int i=a;i<=b;i++){
           s=s+i;
        }
        System.out.println(s);
    }
}
