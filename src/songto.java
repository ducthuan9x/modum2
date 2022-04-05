import java.util.Scanner;

public class songto {
    public static void main(String[] args) {
        boolean snt= true;
        int a;
        Scanner ktra= new Scanner(System.in);
        System.out.println("nhập số a");
        a=ktra.nextInt();
        for(int i=2;i<a;i++){
            if(a%i==0){
                System.out.println("không phải số ngto");
                break;
            }
        }
            System.out.println("là số ngto");
    }
}
