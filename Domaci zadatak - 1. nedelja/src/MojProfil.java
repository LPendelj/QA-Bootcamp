import java.util.Scanner;

public class MojProfil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ime");
        String ime = sc.next();

        System.out.println("Unesite prezime");
        String prezime = sc.next();

        System.out.println("Unesite starost");
        int godine = sc.nextInt();

        char p = 'm';

        System.out.println("Da li ste iz Srbije? (da ili ne)");
        String drzava = "Srbija";


        System.out.println("Unesite prosek u srednjoj skoli");
        double prosek = 4.56;


        System.out.println("Ime je " + ime + " " + prezime);
        if (p == 'm') {
            System.out.println("Pol je muski");
        } else System.out.println("Pol je zenski");


        if (prosek > 4.5) {
            System.out.println("Prosek je odlican");
        } else if (prosek > 3.5) {
            System.out.println("Prosek je vrlo dobar");
        } else if (prosek > 2.5) {
            System.out.println("Prosek je dobar");
        } else if (prosek >=2.00) {
            System.out.println("Prosek je dovoljan");
        } else System.out.println("Prosek je nedovoljan");
    }
}