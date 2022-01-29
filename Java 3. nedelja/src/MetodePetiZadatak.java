import java.util.Scanner;

public class MetodePetiZadatak {

    public static Scanner sc = new Scanner(System.in);


    public static boolean palindrom ( int[] niz){

        boolean palindrom = true;

        for (int i = 0, j = niz.length - 1; i < niz.length; i++, j--) {

            if (niz[i] != niz[j]) {
                    palindrom = false;
                    break;
               }
            }

            return palindrom;
        }

        public static void ispisiNiz ( int[] n){
            // {1, 2, 3, 4}
            System.out.print("{");
            for (int i = 0; i < n.length; i++) {
                System.out.print(n[i]);
                // n.lenght - 1 je index poslednjek elementa
                // ako i pokazauje na nesto sto nije poslednji element
                // onda ispisujem zaraz
                if (i != n.length - 1) {
                    // i < n.length - 1 - takodje validan uslov
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }

        public static void main (String[]args){
            System.out.println("Unesite duzinu niza: ");
            int duzinaNiza = sc.nextInt();

            // pravim niz duzine koju je korinisk uneo
            // niz kada se ovako napravi inicijalno ima
            // nule tipa niza na svakoj pozicija
            // ako je niz celih brojeva (int[]), onda je to 0
            // ako je niz realnih brojeva (dpuble[]), onda je to 0.0
            // ako je niz karaktera (char[]), onda je to '\0' (dakle nula tipa char je '\0')
            // ako je niz boolean  (boolean[]) onda je to false
            int[] niz = new int[duzinaNiza];

            for (int i = 0; i < niz.length; i++) {
                System.out.println("Unesi " + i + ". element niza");
                niz[i] = sc.nextInt();
            }

            if(palindrom(niz)){
                System.out.println("Broj je palindrom");
            } else System.out.println("broj nije palindrom");


        }
    }

