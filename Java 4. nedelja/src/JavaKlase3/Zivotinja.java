package JavaKlase3;

public abstract class Zivotinja  {
    public String vrsta;
    public int visina;

    public Zivotinja(String vrsta, int visina) {
        this.vrsta = vrsta;
        this.visina = visina;
    }

    public Zivotinja(String vrsta){
        this.vrsta = vrsta;
    }



    public abstract void zvuk();

}
