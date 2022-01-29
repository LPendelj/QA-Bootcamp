public class NizoviSestiZadatak {
    public static void main(String[] args) {
//Napisati niz od 10 brojeva koji ce se sabirati do 100, kada predje 100 treba ispisati za koliko je presao
//Na primer ako imamo niz 80, 10, 9, 3, 5, 7, 22, 90, 8
//Treba da nam ispise 80, 10, 9, 3 i onda poruka "Presli ste granicu za 2"

        int suma = 0;
        int[] niz = {21, 3, 11, 24, 79, 32};


        for(int i = 0; i < niz.length; i++){
            suma += niz[i];
            if(suma>100){
                break;
            }
        }

        System.out.println("Presli ste granicu za " + (suma-100));
    }
}
