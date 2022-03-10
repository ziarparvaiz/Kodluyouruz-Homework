import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, fizik, kimya, muzik, turkce;

        System.out.print("Matematik Notunuz: ");
        math = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Muzik Notunuz: ");
        muzik = input.nextInt();

        System.out.print("Turkce Notunuz: ");
        turkce = input.nextInt();

        double Result = (math + fizik + kimya + muzik + turkce) / 5;
        if (Result <= 55) {
            System.out.println("Sinifta Kaldiniz Seneye Tekrar Gorusmek Uzere!");
        } else {
            System.out.println("Tebrikler Sinif Gectiniz");
        }

        System.out.println("Ortalamaniz: " + Result);

    }
}
