import java.util.Scanner;

public class chuyenChuThanhSo {
    public static void main(String[] args) {
        int a;
        Scanner so=new Scanner(System.in);
        System.out.println("nhập số a");
        a= so.nextInt();
        String[] number={"không","một","hai","ba","bốn","năm","sáu","bảy","tám","chín","mười"};
        String chuoi=null;
        if(a>=0 && a<=10){
            chuoi=number[a];
        }
        else if(a<20){
            if(a==15){
                chuoi="mười lăm";
            }else {
                chuoi = "mười" + number[a % 10];
            }
        }
        else if(a<100){
            chuoi=number[a/10]  +"mươi"  +number[a%10];
        }
        System.out.println(chuoi);
    }
}
