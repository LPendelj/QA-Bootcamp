package JavaKlase3;

public class Proizvod {
//    Napisati klasu Proizvod koja poseduje sledeca polja/atribute
//    Naziv proizvoda (string)
//    Cena proizvoda (double)
//    Opis proizvoda (string)
//    Tezina proizvoda u gramima (int)
//    Proizvod ne mora imati opis. Napisati konstruktor(e), gettere, settere, toString
//    format za to string
//    Naziv proizvoda: naziv
//    Cena proizvoda: cena
//    Opis proizvoda: tezina (string)
//    Tezina proizvoda: tezina g

    private String naziv;
    private double cena;
    private String opis;
    private int tezina;

    public Proizvod(String naziv, double cena, String opis, int tezina){
        this.naziv = naziv;
        this.cena = cena;
        this.opis = opis;
        this.tezina = tezina;
    }
    public Proizvod(String naziv, double cena, int tezina){
        this.naziv = naziv;
        this.cena = cena;
        this.opis = null;
        this.tezina = tezina;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append( "Proizvod{ naziv='" + naziv + '\'' + ", cena=" + cena );

          if(opis!=null) {
             sb.append( ", opis='" + opis + '\'');
          }

        sb.append(", tezina=" + tezina + " g}");

        return sb.toString();
    }
}
