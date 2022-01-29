import java.util.Scanner;

public class DomaciZadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj clanova niza:");
        int n = sc.nextInt();

        while(n<1){
            System.out.println("Morate uneti pozitivan broj.");
            n= sc.nextInt();
        }

        int[] niz = new int[n];
        int proizvod = 1;

        for(int i = 0; i<niz.length; i++) {
            System.out.println("Dodajte clana niza");
            niz[i] = sc.nextInt();
            proizvod *= niz[i];
        }

        System.out.println(proizvod + " je proizvod.");
    }
}
