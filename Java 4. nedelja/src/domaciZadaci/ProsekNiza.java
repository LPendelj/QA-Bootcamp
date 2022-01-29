package domaciZadaci;

public class ProsekNiza {
    public static void main(String[] args) {

        double[] niz = {34, 54, 54, 23,1,2,154,54};

        prosekNiza(niz);

    }


    public static void prosekNiza(double[] niz){
        double suma = 0;

        for (int i = 0; i<niz.length; i++){
            suma+=niz[i];
        }

        double prosek = suma/niz.length;

        System.out.println("Prosek je " + prosek);
    }
}
