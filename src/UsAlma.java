import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        int n,r;

        Scanner inp = new Scanner(System.in);

        System.out.print("Ussu Alinacak Sayiyi Giriniz :");
        n=inp.nextInt();

        System.out.print("Us Olacak Sayiyi Giriniz : ");
        r=inp.nextInt();

        int total = 1;

        for (int i = 1 ; i<=r;i++){
            total*=n;

        }
        System.out.println("Sonuc : "+total );



    }
}
