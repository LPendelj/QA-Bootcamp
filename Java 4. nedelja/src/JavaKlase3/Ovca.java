package JavaKlase3;

public class Ovca extends Zivotinja{
    public String krzno;

    public Ovca(String vrsta, int visina, String krzno) {
        super(vrsta, visina);
        this.krzno = krzno;
    }


    @Override
    public void zvuk() {
        System.out.println("Beeeeeeeeeeee");
    }

    public void zvuk(int br){
        for(int i =0; i<br; i++){
            System.out.println("Beeeeeeeeeeeeeeeee");
        }
    }
}
