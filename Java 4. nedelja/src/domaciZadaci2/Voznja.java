package domaciZadaci2;

import javaKlase2.Osoba;

public class Voznja {
    public static void main(String[] args) {
        Osoba o1 = new Osoba("Petar", "Petrovic", 1991, 182);
        Osoba o2 = new Osoba("Jovan", "Petrovic", 1972, 189);

        Automobil a1 = new Automobil("Zastava", "101", 102021);
        Automobil a2 = new Automobil("Fiat", "Punto", 312061, o1);

        System.out.println("Ime vlasnika je: " + a2.getVlasnik().getIme());
        a1.setVlasnik(o2);
        System.out.println("Ime vlasnika je: " + a1.getVlasnik().getIme());
        System.out.println("Marka automobila je " + a2.getMarka());
        a1.getSerialId();
        a2.getSerialId();

    }
}
