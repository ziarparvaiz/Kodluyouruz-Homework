import java.util.Scanner;

public class Pratik_03 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        int A, B;
        double C;

        System.out.print("1. Kenari Giriniz: ");
        A = input.nextInt();
        System.out.print("2. Kenari Giriniz: ");
        B = input.nextInt();

        C = Math.sqrt((A * A) + (B * B));
        System.out.println("Hipotenüs: " + C);

    }
}
