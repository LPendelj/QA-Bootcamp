import java.util.Scanner;

public class NoviUcenik {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ime");
    String ime = sc.next();

        System.out.println("Unesite prezime");
    String prezime = sc.next();

        System.out.println("Unesite godinu rodjena");
    int godina = sc.nextInt();

    if (godina>2014){
        System.out.println( ime + " " + prezime + " tek treba da zapocne obrazovanje");
    } else if (godina<=2002){
        System.out.println( ime + " " + prezime + " je zavrsio/la skolu");
    } else System.out.println( ime + " " + prezime + " je " + (2015-godina) + ". razred");


    }
}