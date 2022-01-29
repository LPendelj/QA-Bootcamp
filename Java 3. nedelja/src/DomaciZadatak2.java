import java.util.Scanner;

public class DomaciZadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj clanova niza:");
        int n = sc.nextInt();

        while(n<1){
            System.out.println("Morate uneti pozitivan broj.");
            n= sc.nextInt();
        }

        int[] niz = new int[n];
        int suma = 0;

        for(int i = 0; i<niz.length; i++) {
            System.out.println("Dodajte clana niza");
            niz[i] = sc.nextInt();
            suma += niz[i];
        }

        System.out.println(suma + " je suma.");
    }


}
