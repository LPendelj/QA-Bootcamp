package domaciZadaci2;

import javaKlase2.Osoba;

public class Automobil {
        private String marka;
        private String model;
        private int serialId;
        private Osoba vlasnik;

    public Automobil(String marka, String model, int serialId, Osoba vlasnik) {
        this.marka = marka;
        this.model = model;
        this.serialId = serialId;
        this.vlasnik = vlasnik;
    }
    public Automobil(String marka, String model, int serialId) {
        this.marka = marka;
        this.model = model;
        this.serialId = serialId;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerialId() {
        return serialId;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }


}
