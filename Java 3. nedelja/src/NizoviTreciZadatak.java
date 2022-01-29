public class NizoviTreciZadatak {
    public static void main(String[] args) {
        int[] niz = {5, 8, 9, 41, 45, 79, 91, 21, 43,23};

        int min = 101;
        int max = 0;
        int suma = 0;

          for (int i = 0;i<niz.length; i++)  {
                if(niz[i]<min) {
                    min = niz[i];
                }
              if(niz[i]>max) {
                  max = niz[i];
              }
              suma+=niz[i];
            }
        System.out.println("Minimalna vrednost je " + min);
        System.out.println("Razlika maksimuma i minimuma je " + (max-min));
        System.out.println("Prosecna vrednost niza je " + suma/niz.length);

//Zadatak 3 - Ispisati najmanji broj niza ako su clanovi niza od 1 do 100
//Dodatak - Ispisati razliku izmedju minimuma i maximuma
//Dodatak - Koja je prosecna vrednost niza?
    }
}
