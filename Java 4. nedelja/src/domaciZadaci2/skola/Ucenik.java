package domaciZadaci2.skola;

import java.util.ArrayList;

public class Ucenik {
    private String ime;
    private String prezime;
    private ArrayList<Integer> ocene;

    public Ucenik(String ime, String prezime, ArrayList<Integer> ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
    }
    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = new ArrayList<Integer>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }


    public void prosek(ArrayList<Ocena> ocene){
        double suma = 0;

        for (Ocena o : ocene){
            suma += o.getOcena();
        };

        System.out.println("Prosek je " + suma/ocene.size());
    }

    @Override
    public String toString() {
        String s = "ime='" + ime + '\'' +
                ", prezime='" + prezime +
                "ima ocene:/n";
        for (int o : ocene){
            s+=o + "\n";
        }
        return s;

    }
}
