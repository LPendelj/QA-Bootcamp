import java.util.Scanner;

public class JavaSintaksa1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Unesi duzinu zida:");
        double a = sc.nextDouble();

        System.out.println("Unesi duzinu zida:");
        double b = sc.nextDouble();


        System.out.println("Unesi visinu :");
        double c = sc.nextDouble();

        System.out.println("Povrsina zidova sobe: " + (2*(a*c+b*c)+a*b));
    }
}
