import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Math, Physical, Chemistry, Turkish, History, Music;

        System.out.print("Your math grade: ");
        Math = input.nextInt();

        System.out.print("Your physical grade: ");
        Physical = input.nextInt();

        System.out.print("Your chemistry grade: ");
        Chemistry = input.nextInt();

        System.out.print("Your turkish grade: ");
        Turkish = input.nextInt();

        System.out.print("Your history grade: ");
        History = input.nextInt();

        System.out.print("Your music grade: ");
        Music = input.nextInt();

        int Total = Math + Physical + Chemistry + Turkish + History + Music;
        double Result = Total / 6.0;
        String Average_Calculation = Result > 60.0 ? "Passed the Class" : "Failed in Class";

        System.out.print("Your average: " + Result + " Your Average Status: " + Average_Calculation);

    }
}
