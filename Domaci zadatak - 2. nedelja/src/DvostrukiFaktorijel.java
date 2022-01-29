import java.util.Scanner;

public class DvostrukiFaktorijel {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj:");
        int n = sc.nextInt();

        int rez = 1;
        for (int i = n; i >= 0; i = i-2)
            if (i > 1) {
                rez *= i;
            } else break;

        System.out.println("Dvostruki faktorijel broja " + n + " je " + rez);

    }
}
