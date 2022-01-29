package domaciZadaci2;

public class Glumac {
    private String ime;
    private String prezime;
    private char pol;
    private int godine;
    private int ocena;
    private boolean izSrbije;

    public Glumac(String ime, String prezime, char pol, int godine, boolean izSrbije) {
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.godine = godine;
        this.ocena = 0;
        this.izSrbije = izSrbije;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public char getPol() {
        return pol;
    }

    public int getGodine() {
        return godine;
    }

    public int getOcena() {
        if (ocena == 0) {
            System.out.println("ocena nije uneta");
            return -1;
        }
        else return ocena;
    }

    public boolean isIzSrbije() {
        if(this.izSrbije)
        System.out.println("Osoba je iz Srbije");
        else System.out.println("Osoba nije iz Srbije");
        return izSrbije;
    }

    public void setOcena(int ocena) {
        if(0<ocena && ocena<=10)
        this.ocena = ocena;
        else System.out.println("uneta vrednost ocene nije dozvoljena.");
    }



}
