public class NizoviPetiZadatak {
    public static void main(String[] args) {
        //Zadatak 5 - Napraviti niz integera i prikazati koji elementi su deljivi sa 3


        int[] niz = {13,4,25,29,2,133,145,43,31};
        boolean deljiv = false;

        for(int i = 0; i<niz.length; i++){


            if(niz[i]%3==0){

                System.out.println("Broj " + niz[i] + " deljiv je sa 3");

                deljiv = true;
            }

        }

        if(deljiv == false){
            System.out.println("Nijedan broj nije deljiv sa 3");
        }




    }
}
