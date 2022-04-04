import java.util.Scanner;

public class ngytrongthang {
    public static void main(String[] args) {
        int a;
        Scanner thanga=new Scanner(System.in);
        System.out.println("nhập tháng a");
        a= thanga.nextInt();
            if(a==2){
                System.out.println("tháng có 28 hoặc 29 ngày");
            }
            if(a==1||a==3||a==5){
                System.out.println("ththáng có 31 ngày");
            }
            if(a==4||a==6){
                System.out.println("tháng có 30 ngày");
            }
        }
    }
