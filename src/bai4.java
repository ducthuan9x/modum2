import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int a;
        Scanner nhapa=new Scanner(System.in);
        System.out.println("nhập a");
        a= nhapa.nextInt();
        for(int i=1; i<=a;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
