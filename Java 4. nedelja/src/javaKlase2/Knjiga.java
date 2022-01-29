package javaKlase2;

public class Knjiga {
    private String naziv;
    private Osoba vlasnik;
    private Osoba pisac;
    private int godinaIzdanja;
    private int brojStrana;

    public Knjiga(String naziv, Osoba vlasnik, Osoba pisac, int godinaIzdanja, int brojStrana) {
        this.naziv = naziv;
        this.vlasnik = vlasnik;
        this.pisac = pisac;

        if(brojStrana<0){
            System.out.println("Broj strana ne moze biti negativan");
        } else this.brojStrana = brojStrana;

        if(godinaIzdanja<0){
            System.out.println("Godina izdanja ne moze biti negativan");
        } else this.godinaIzdanja = godinaIzdanja;

    }
    public Knjiga(String naziv, Osoba pisac, int godinaIzdanja, int brojStrana) {
        this.naziv = naziv;
        this.vlasnik = null;
        this.pisac = pisac;

        if(brojStrana<0){
            System.out.println("Broj strana ne moze biti negativan");
        } else this.brojStrana = brojStrana;

        if(godinaIzdanja<0){
            System.out.println("Godina izdanja ne moze biti negativan");
        } else this.godinaIzdanja = godinaIzdanja;

    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public Osoba getPisac() {
        return pisac;
    }

    public void setPisac(Osoba pisac) {
        this.pisac = pisac;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        if(godinaIzdanja<0){
            System.out.println("Godina izdanja ne moze biti negativan");
        } else this.godinaIzdanja = godinaIzdanja;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        if(brojStrana<0){
            System.out.println("Broj strana ne moze biti negativan");
        } else this.brojStrana = brojStrana;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "naziv='" + naziv + '\'' +
                ", vlasnik=" + vlasnik +
                ", pisac=" + pisac +
                ", godinaIzdanja=" + godinaIzdanja +
                ", brojStrana=" + brojStrana +
                '}';
    }
}
