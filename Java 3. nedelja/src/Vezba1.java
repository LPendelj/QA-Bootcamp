public class Vezba1 {
    public static void main(String[] args) {
       //Napisati funkciju koja sabira 2 niza iste duzine element po element. (Dakle prosledjujemo 2 niza, a vracamo taj novi niz)
       // Primer: [2, 4, 6] + [1, 4, 4]  -> [3, 8, 10]
        int[] niz1 = {3,2,5,1,8,9};
        int[] niz2 = {0,5,5,6,-4,11};

        int[] niz3 = sabiranjeNizova(niz1, niz2);
        for (int i = 0; i<niz1.length; i++) {
            System.out.println(niz3[i]);
        }
    }

    public static int[] sabiranjeNizova(int[] niz1, int[] niz2){
        int[] niz3 = new int[niz1.length];
        for (int i = 0; i<niz1.length; i++){
            niz3[i] = niz1[i] + niz2[i];
        }

        return niz3;
    }
}
