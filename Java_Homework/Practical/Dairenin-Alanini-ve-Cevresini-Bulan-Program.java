import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        int R;
        double PI = 3.14;

        System.out.print("Dairenin yari capini giriniz: ");
        R = input.nextInt();

        double Area = PI * R * R;
        double Environment = 2 * PI * R;

        System.out.println("Dairenin Alani: " + Area);
        System.out.println("Dairenin Cevresi: " + Environment);
    }
}
