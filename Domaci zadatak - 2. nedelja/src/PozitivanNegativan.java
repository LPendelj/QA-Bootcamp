import java.util.Scanner;

public class PozitivanNegativan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("unesite  broj:");
    int m = sc.nextInt();


            if (m == 0) {
        System.out.println("uneti broj je nula.");
    }
            else if (m<0) {
        System.out.println("uneti broj je negativan.");
    }
            else if (m>0) {
        System.out.println("uneti broj je pozitivan.");
    } else System.out.println("unet je neodgovarajuci broj.");

}
}
