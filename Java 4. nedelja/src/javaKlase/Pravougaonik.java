package javaKlase;

public class Pravougaonik {
    private double duzina;
    private double sirina;

    public Pravougaonik(double duzina, double sirina) {
        this.duzina = duzina;
        this.sirina = sirina;
    }

    public double getDuzina() {
        return duzina;
    }

    public void setDuzina(double duzina) {
        this.duzina = duzina;
    }

    public double getSirina() {
        return sirina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public double povrsina(){
        double p = duzina*sirina;
        return p;
    }

    public double obim(){
        double o = 2*(duzina+sirina);
        return o;
    }

    public String toString() {
        StringBuilder pravougaonik = new StringBuilder();

        pravougaonik.append("Duzina je: " + this.duzina);
        pravougaonik.append(".\nsirina je " + this.sirina);


        return pravougaonik.toString();
    }
}
