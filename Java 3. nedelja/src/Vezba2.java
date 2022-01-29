public class Vezba2 {
    public static void main(String[] args) {
        //Napisati funkciju koja racuna prosecnu vrednost double[] niza.

        double[] niz1 = {1.2, 23, 11.5, 9.5, 10.1, 42, -2.21};

        System.out.println("Prosek je " + doubleNizProsek(niz1));
    }

    public static double doubleNizProsek(double[] niz1){
        double suma = 0;

        for (int i = 0; i< niz1.length; i++){
            suma+=niz1[i];
        }

         double prosek = suma/niz1.length;
        System.out.println("suma " + suma);
        System.out.println("duzina" + niz1.length);
      
            return prosek;
    }


}
