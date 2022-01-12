package korisnik;

import Racun.Racun;

public class Korisnik {
    private String fullName;
    private Racun racun;
    private String korisnickoIme;
    private String sifra;

    public Korisnik(){

    };

    public Korisnik(String fullName, String sifra) {
        this.fullName = fullName;
        this.racun = new Racun();
        this.korisnickoIme = racun.getIdRacuna() + fullName;
        this.sifra = sifra;
    }

    public Korisnik(String fullName, Racun racun) {
        this.fullName = fullName;
        this.racun = racun;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    public void setSifra(String sifra){
        this.sifra = sifra;
    }

    public String getSifra(){
        return sifra;
    }



    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public boolean proveriRacun(String korisnickoIme){
        if(korisnickoIme.equals(this.korisnickoIme)){
            System.out.println("Stanje racuna je " + this.getRacun().getStanjeNaRacunu());
            return true;
        }
        return false;
    }

    // public void izvrsiKupovinu();
    // public void novoPlacanje();

}
