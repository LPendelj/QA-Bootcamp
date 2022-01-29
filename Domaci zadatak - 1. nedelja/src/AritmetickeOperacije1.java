import java.util.Scanner;

public class AritmetickeOperacije1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite dva broja");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Rezultat sabiranja je " + (a+b));
        System.out.println("Rezultat oduzimanja je " + (a-b));
        System.out.println("Rezultat mnozenja je " + a*b);

        if (b==0) {
            System.out.println("Nije dozvoljeno deljenje sa nulom");
        } else System.out.println("Rezultat deljenja je " + a/b);

        if (b==0) {
            System.out.println("Nije dozvoljeno deljenje sa nulom");
        } else System.out.println("Ostatak deljenja je " + a%b);

    }
}
