import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    int Heat;

    System.out.print("Sicaklik Giriniz: ");
    Heat = input.nextInt();

    if (Heat < 5) {
        System.out.println("Kayak yapabilirsiniz...");
    } else if (Heat <= 25) {
        if (Heat <= 15) {
            System.out.println("Sinemeya Gidebilirsiniz...");
        }
        if (Heat >= 10) {
            System.out.println("Piknige Gidebilirsiniz...");
        }
    } else {
        System.out.println("Yuzmeye Gidebilirsiniz...");
    }


    }
}
