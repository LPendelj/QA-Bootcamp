package JavaKlase3;

public class Vuk extends Zivotinja{
    public int duzinaKandzi;

    public Vuk(String vrsta, int visina, int duzinaKandzi) {
        super(vrsta, visina);
        this.visina = 0;
        this.duzinaKandzi = duzinaKandzi;
    }


    @Override
    public void zvuk() {
        System.out.println("Vauuuuuuuuuuuuuuuuuuu");

    }
}
