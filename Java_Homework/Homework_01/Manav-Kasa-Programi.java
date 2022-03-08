import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        double Armut = 2.14;
        double Elma = 3.67;
        double Domates = 1.11;
        double Muz = 0.95;
        double Patlican = 5.00;

        double Armut_KG, Elma_KG, Domates_KG, Muz_KG, Patlican_KG;

        System.out.print("Armut Kaç Kilo ?: ");
        Armut_KG = input.nextDouble();

        System.out.print("Elma Kaç Kilo ?: ");
        Elma_KG = input.nextDouble();

        System.out.print("Domates Kaç Kilo ?: ");
        Domates_KG = input.nextDouble();

        System.out.print("Muz Kaç Kilo ?: ");
        Muz_KG = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ?: ");
        Patlican_KG = input.nextDouble();

        double Total = (Armut_KG * Armut) + (Elma_KG * Elma) + (Domates_KG * Domates) + (Muz_KG * Muz) + (Patlican_KG * Patlican);
        System.out.println("Toplam Tutar: " + Total);

    }
}
