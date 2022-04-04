import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int a;
        Scanner nhapDiem=new Scanner(System.in);
        System.out.println(" nhập điểm a");
        a= nhapDiem.nextInt();
        if(a<=5){
            System.out.println(" xếp loại yếu");
        } else if(a<8){
            System.out.println("xếp loại khá");
        }else{
            System.out.println("xếp loại giỏi");
        }
    }
}
