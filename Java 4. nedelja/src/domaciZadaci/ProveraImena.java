package domaciZadaci;

public class ProveraImena {
    public static void main(String[] args) {

        String[] niz = {"Pera", "Aca", ""};
        proveraNiza(niz);
    }

   // "Marija" ili "Petar"

    public static void proveraNiza(String[] niz){
        boolean provera = false;

        for (int i = 0; i<niz.length; i++){
            if(niz[i] == "Marija" || niz[i] == "Stefan") {
                provera = true;
            }
        }
        if(provera) {
            System.out.println("Postoji ime Marija ili Stefan");
        } else  System.out.println("Ne postoji ni ime Marija ni ime Stefan");

    }
}
