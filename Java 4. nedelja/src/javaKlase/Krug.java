package javaKlase;

public class Krug {
    private double poluprecnik;
    private final double PI = Math.PI;

    public Krug(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    public double getPoluprecnik() {
        return poluprecnik;
    }

    public void setPoluprecnik(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    public double getPI() {
        return PI;
    }

    public double obim(){

        return 2*poluprecnik*PI;
    }

    public double povrsina(){
        double p = poluprecnik * poluprecnik * PI;

        return p;
    }

    public String toString() {
        StringBuilder krug = new StringBuilder();
        krug.append("Duzina je: " + this.poluprecnik);


        return krug.toString();
    }
}
