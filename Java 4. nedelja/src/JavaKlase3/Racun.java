package JavaKlase3;

import javaKlase2.Osoba;

import java.util.ArrayList;

public class Racun {
  /*  Napisati klasu Racun, koja ima sledece atribute:
    Niz kupljenih proizvoda (arrayList<Proizvod>)
    Datum (String)
    kupac (Osoba)
    prodavac (Osoba)
    Iznos (double)
    Napisati konstruktor(e), gettere, settere(polje iznos moze samo da se dohvati!) toString. Napisati metodu za dodavanje proizvoda na racun i uklanjanje proizvoda sa racuna.
    format za toString
    Kupac: ime prezime
    Prodavac: ime prezime
    Datum: datum
    Iznos: iznos
    Kupljeni proizvodi:
    naziv, cena
            naziv, cena
    naziv, cena*/

    private ArrayList<Proizvod> listaProizvoda;
    private String datum;
    private Osoba kupac;
    private Osoba prodavac;
    private double iznos;

    public Racun(ArrayList<Proizvod> listaProizvoda, String datum, Osoba kupac, Osoba prodavac, double iznos) {
        this.listaProizvoda = listaProizvoda;
        this.datum = datum;
        this.kupac = kupac;
        this.prodavac = prodavac;
        this.iznos = 0;
        for (Proizvod p: listaProizvoda){
            this.iznos+=p.getCena();
        }
    }

    public ArrayList<Proizvod> getListaProizvoda() {
        return listaProizvoda;
    }

    public String getDatum() {
        return datum;
    }

    public Osoba getKupac() {
        return kupac;
    }

    public Osoba getProdavac() {
        return prodavac;
    }

    public double getIznos() {
        return iznos;
    }

    public void setListaProizvoda(ArrayList<Proizvod> listaProizvoda) {
        this.listaProizvoda = listaProizvoda;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setKupac(Osoba kupac) {
        this.kupac = kupac;
    }

    public void setProdavac(Osoba prodavac) {
        this.prodavac = prodavac;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();


        sb.append(", datum='" + datum + "\n Kupac= " + kupac +
                ", Prodavac=" + prodavac +
                ", iznos=" + iznos +
                "\n");


        for (int i =0; i<listaProizvoda.size(); i++){
            sb.append(listaProizvoda.get(i));
            sb.append(", " + listaProizvoda.get(i).getCena() + "\n");

        }

        return sb.toString();

    }
}
