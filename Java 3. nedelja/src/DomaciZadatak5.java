import java.util.Scanner;

public class DomaciZadatak5 {
    public static void main(String[] args) {

        System.out.println("Proizvod unetih brojeva je " + pomnozi());

    }

    public static double pomnozi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("unesite prvi broj:");
        double a = sc.nextDouble();
        System.out.println("unesite drugi broj:");
        double b = sc.nextDouble();
        System.out.println("unesite treci broj:");
        double c = sc.nextDouble();

        return a*b*c;
    }
}
