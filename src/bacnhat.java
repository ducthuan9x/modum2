import java.util.Scanner;

public class bacnhat {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner a1 =new Scanner(System.in);
        Scanner b1 =new Scanner(System.in);
        System.out.println("nhap gia tri a");
        a=a1.nextDouble();
        System.out.println("nhap gia tri b");
        b=b1.nextDouble();
        if (a==0){
            if(b==0){
                System.out.println("phương trình có vô số nghiem");
            }else{
                System.out.println("pt vô nghiệm");
            }
        }else{
            System.out.println("pt có nghiệm x= " +(-b/a));
        }
    }
}
