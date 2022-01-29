import java.util.Scanner;

public class DomaciZadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj clanova niza:");
        int n = sc.nextInt();

        while(n<1){
            System.out.println("Morate uneti pozitivan broj.");
            n= sc.nextInt();
        }

        int[] niz = new int[n];


        for(int i = 0; i<niz.length; i++){
            System.out.println("Dodajte clana niza");
            niz[i] = sc.nextInt();
            System.out.println("Ako niste sigurni probajte opet:");
           niz[i] = dodajUNiz();
        }

        for(int i = 0; i<niz.length; i++){
            if(i % 2 == 1) {
                System.out.println("clan niza " + i +" je: " + niz[i]);
            }
        }



    }

    public static int dodajUNiz(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}
