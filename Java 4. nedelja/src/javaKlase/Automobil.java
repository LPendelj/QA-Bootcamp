package javaKlase;

public class Automobil {
    private String marka;
    private String zemlja;
    private int godiste;
    private double kilometraza;

    Automobil(String marka1, String zemlja1, int godiste1, double kilometraza1){
        marka = marka1;
        zemlja = zemlja1;
        godiste = godiste1;
        kilometraza = kilometraza1;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getZemlja() {
        return zemlja;
    }

    public void setZemlja(String zemlja) {
        this.zemlja = zemlja;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public double getKilometraza() {
        return kilometraza;
    }

    public void setKilometraza(double kilometraza) {
        this.kilometraza = kilometraza;
    }

    @Override
    public String toString() {
        StringBuilder auto = new StringBuilder();
        auto.append("Marka je: " + this.marka);
        auto.append(".\nZemlja porekla je: " + this.zemlja);
        auto.append(".\nGodiste je " + this.godiste);
        auto.append(".\nKilometraza je " + this.kilometraza);

        return auto.toString();
    }
}
