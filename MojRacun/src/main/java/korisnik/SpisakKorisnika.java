package korisnik;

import java.util.ArrayList;

public class SpisakKorisnika {
    private ArrayList<Korisnik> spisakKorisnika;

    public SpisakKorisnika() {
        this.spisakKorisnika = new ArrayList<Korisnik>();
    }

    public ArrayList<Korisnik> getSpisakKorisnika() {
        return spisakKorisnika;
    }


    public void dodajKorisnika(Korisnik korisnik){
       this.spisakKorisnika.add(korisnik);
    }


}
