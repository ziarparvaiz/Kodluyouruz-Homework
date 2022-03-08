import java.util.Scanner;
public class Main {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        int KM;
        double Per_KM = 2.20, Total, Begin_Price = 10;

        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        KM = input.nextInt();

        Total = KM * Per_KM;
        Total += Begin_Price;
        Total = Total < 20 ? 20 : Total;

        System.out.println("Toplam Tutariniz: " + Total);

    }
}
