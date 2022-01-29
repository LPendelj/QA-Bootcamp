import java.util.Scanner;

public class ParNepar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("unesite  broj:");
        int m = sc.nextInt();


            if (m / 2 == 0) {
                System.out.println("uneti broj je nula.");
            }
            else if (m%2==0) {
                System.out.println("uneti broj je paran.");
            }
            else if (m%2==1) {
            System.out.println("uneti broj je neparan.");
            } else System.out.println("unet je neodgovarajuci broj.");

        }
    }

