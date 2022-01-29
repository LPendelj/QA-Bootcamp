package JavaKlase3;

public class Lisica extends Zivotinja  {

    public Lisica(String vrsta, int visina) {
        super(vrsta, visina);
    }

    @Override
    public void zvuk() {
        System.out.println("What does the fox say");
    }
}
