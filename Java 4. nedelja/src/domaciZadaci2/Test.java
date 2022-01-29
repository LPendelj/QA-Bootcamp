package domaciZadaci2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Sportista s1 = new Sportista("Ivan Ivanovic", "fudbal", "Inter", 11 );
        Sportista s2 = new Sportista("Joca Milanovic", "fudbal", "Bolonja", 1 );
        Sportista s3 = new Sportista("Deki Petrovic", "fudbal", "Bolonja", 42 );
        Sportista s4 = new Sportista("Dragan Jovanovic", "fudbal", "Bolonja", 102 );


        System.out.println(s1.getKlub());
        System.out.println(s1.getBroj());
        s1.setKlub("Barselona");
        s1.setBroj(24);

        System.out.println("Igrac " + s1.getImePrezime() + " je sada u klubu:");
        System.out.println(s1.getKlub());
        System.out.println(s1.getBroj());

        Scanner sc = new Scanner(System.in);

        Glumac g1 = new Glumac("Mila", "Jovanovic", 'z', 31, true );
        g1.setOcena(7);
        System.out.println("Ocena glumice " + g1.getIme() + " " + g1.getPrezime() + " je " + g1.getOcena());




        s4.getBroj();

    }
}
