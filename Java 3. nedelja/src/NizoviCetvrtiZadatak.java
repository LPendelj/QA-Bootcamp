import java.util.Scanner;

public class NizoviCetvrtiZadatak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] niz = new int[5];


        for(int i = 0; i < niz.length; i++){
            System.out.println("Unesite clana niza:");
            niz[i] = sc.nextInt();
        }

        for(int i = 0; i < niz.length; i++) System.out.println("Clan niza " + i + " je " +niz[i]);


    }
}
