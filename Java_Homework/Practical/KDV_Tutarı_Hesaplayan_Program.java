import java.util.Scanner;

public class KDV {
    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        double Amount, KDV_Rat = 0.18, KDV_Amount, KDV_With_Amount, KDV_2 = 0.08;

        System.out.print("Ucret Tutari Giriniz: ");
        Amount = input.nextInt();
        KDV_Amount = Amount * KDV_Rat;
        KDV_With_Amount = Amount <= 0 ? 0 : (Amount > 0 && Amount<= 1000 ? KDV_Rat : KDV_2);

        System.out.println("===============================");
        System.out.println(Amount <= 0 ? "Tutar 0`dan kucuk olmaz" : "KDV`siz Tutar: "+(Amount > 0 && Amount <= 1000 ? Amount + KDV_Amount : Amount + (Amount * KDV_2)));
        System.out.println("KDV Orani: " + KDV_Rat);
        System.out.println("KDV`li Tutari: " + KDV_With_Amount);
        System.out.println("===============================");

    }
}
