import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String  UserName, Password;

        System.out.print("Kullanici Adiniz: ");
        UserName = input.nextLine();
        System.out.print("Sefriniz: ");
        Password = input.nextLine();

        if (UserName.equals("Patika") && Password.equals("Java123")) {
            System.out.println("Girisiniz Basariyla Yapilmistir!");
        } else {
            System.out.println("Bilgilariniz Yanlis...");
        }

    }
}
