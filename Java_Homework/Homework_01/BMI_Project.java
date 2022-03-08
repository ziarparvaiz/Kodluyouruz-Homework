import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        double Kilo, Boy;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        Boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        Kilo = input.nextInt();

        double BMI_Calculate  = Kilo / (Boy * Boy);

        System.out.println("Vücut Kitle İndeksiniz: " + BMI_Calculate );
    }
}
