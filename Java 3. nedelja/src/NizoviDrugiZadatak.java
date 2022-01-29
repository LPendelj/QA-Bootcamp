public class NizoviDrugiZadatak {
    public static void main(String[] args) {

        int[] niz = {3, 5, 9, 9, 10, 11, -5, 2, 81, -43};

        int suma = 0;
        for(int i = 0; i<niz.length; i++){
            suma+=niz[i];
        }
        System.out.println("Suma brojeva u nizu je " + suma);




    }
}
