import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Num_1, Num_2, Select;

        System.out.print("Ilk Sayiyi Giriniz: ");
        Num_1 = input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz: ");
        Num_2 = input.nextInt();

        System.out.println("1- Toplam\n2- Cikarma\n3- Carpma\n4- Bolme");
        System.out.print("Seciminiz: ");
        Select = input.nextInt();

        switch (Select) {
            case 1 -> System.out.println("Toplam: " + (Num_1 + Num_2));
            case 2 -> System.out.println("Cikarma: " + (Num_1 - Num_2));
            case 3 -> System.out.println("Carpma: " + (Num_1 * Num_2));
            case 4 -> {
                if (Num_2 != 0) {
                    System.out.println("Bolme: " + (Num_1 / Num_2));
                } else {
                    System.out.println("Bir sayi 0'a bolunemez!");
                }
            }
            default -> System.out.println("Bir Seyler Yanlis...");
        }

//        switch (Select) {
//            case 1:
//                System.out.println("Toplam: " + (Num_1 + Num_2));
//                break;
//            case 2:
//                System.out.println("Cikarma: " + (Num_1 - Num_2));
//                break;
//            case 3:
//                System.out.println("Carpma: " + (Num_1 * Num_2));
//                break;
//            case 4:
//                System.out.println("Bolme: " + (Num_1 / Num_2));
//                break;
//            default:
//                System.out.println("Bir Seyler Yanlis...");
//        }

    }
}
