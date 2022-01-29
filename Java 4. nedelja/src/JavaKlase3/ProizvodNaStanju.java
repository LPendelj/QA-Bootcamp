package JavaKlase3;

public class ProizvodNaStanju {

  /*  Napisati klasu ProizvodNaStajanju, koja poseduje sledece atribute
    proizvod (Proizvod)
    kolicina na stajanju (int)
    Napisati konstruktor(e), gettere, settere, toString.
    Format za toString
    Naziv proizvoda: <naziv>
    Kolicina na stajanju: kolicina*/

    private Proizvod proizvod;
    private int kolicinaNaStanju;

    public ProizvodNaStanju(Proizvod proizvod, int kolicinaNaStanju) {
        this.proizvod = proizvod;
        this.kolicinaNaStanju = kolicinaNaStanju;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public int getKolicinaNaStanju() {
        return kolicinaNaStanju;
    }

    public void setKolicinaNaStanju(int kolicinaNaStanju) {

        if(kolicinaNaStanju<0){
            System.out.println("ne moze se uneti negativna kolicina.");
        } else this.kolicinaNaStanju = kolicinaNaStanju;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProizvodNaStanju{" +
                "proizvod=" + proizvod.getNaziv() +
                ", kolicinaNaStanju=" + kolicinaNaStanju +
                '}');

        return sb.toString();
    }
}
