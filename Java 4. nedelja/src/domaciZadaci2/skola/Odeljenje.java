package domaciZadaci2.skola;

import java.util.ArrayList;

public class Odeljenje {
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<Ucenik>();
    }

    public void upisiUcenika(Ucenik u){
        this.dnevnik.add(u);
    }

    public void isisiUcenika(Ucenik u){
        this.dnevnik.remove(dnevnik.indexOf(u));
    }

    public void ispisiUcenika(int i){
        for(int j = 0; j < dnevnik.size(); j++ ){
            if(dnevnik.indexOf(j) == (i - 1)){
                dnevnik.remove(j);
            }
        }
    }

    public void pogledajOcene(Ucenik u){
        for(Ucenik ucenik : dnevnik){
            if(ucenik == u){
                ucenik.getOcene();
                System.out.println(u.getOcene());
            }
        }
    }

    public void pogledajOcene(int i){
        for(Ucenik u: dnevnik){
            if(dnevnik.indexOf(u) == i){
                System.out.println(u.getOcene());
            }
        }
    }

    public double prosecnaOcena(Ucenik u){
        double prosek = 0;
        double suma = 0;
        ArrayList<Integer> ocene = u.getOcene();
        for(Ucenik ucenik : dnevnik){
            if(ucenik == u){
                for(int i = 0; i < ocene.size() ; i++){
                    suma = suma + ocene.get(i);
                }
            }
            prosek = suma / ocene.size();
        }
        return prosek;
    }
    //    Metod prosecnaOcena(int i) koja ispisuje prosecnu ocenu ucenika na poziciji {i} u dnevniku.
    public double prosecnaOcena(int i) {
        double prosek = 0;
        double suma = 0;
        ArrayList<Integer> ocene = new ArrayList<Integer>();
        for (Ucenik ucenik : dnevnik) {
            if (dnevnik.indexOf(ucenik) == i) {
                ocene = ucenik.getOcene();
            }
        }
        for (int j = 0; j < ocene.size(); j++) {
            suma = suma + ocene.get(j);
        }
        prosek = suma / ocene.size();

        return prosek;
    }

//   Metod prosecnaOcenaOdeljenja() koja vraca prosecnu ocenu celog odeljenja (0, ako nema ucenika u odeljenju).

    public double prosecnaOcenaOdeljenja() {
        //zbir proseka svih ucenika
        double zbirProseka = 0;
        //prosek jednog ucenika
        double suma = 0;
        //broji ucenike koji imaju ocene
        double brojac = 0;
        ArrayList<Integer> ocene = new ArrayList<Integer>();
        for (Ucenik ucenik : dnevnik) {
            if (ucenik.getOcene().isEmpty() == false) {
                ocene = ucenik.getOcene();
                for (int j = 0; j < ocene.size(); j++) {
                    suma = suma + ocene.get(j);
                }
                zbirProseka = zbirProseka + (suma / ocene.size());
                brojac++;
            }
        }
        double prosek = zbirProseka / brojac;
        return prosek;
    }

    public void ispisiDnevnik(){
        for(Ucenik u: dnevnik){
            System.out.println(u.getIme() + " " + u.getPrezime() + " ima ocene: ");
            if(u.getOcene().isEmpty()){
                System.out.println("Ucenik/ca nema ocene");
            }
            else {
                System.out.println(u.getOcene());
            }
            System.out.println();
        }
    }

    public void opisnaOcena(Ucenik u){
        if(prosecnaOcena(u)<2 ){
            System.out.println("Nedovoljan");
        }
        else if(prosecnaOcena(u) > 4.5){
            System.out.println("Odlican");
        }
        else if(prosecnaOcena(u)> 3.5){
            System.out.println("Vrlo dobar");
        }
        else if(prosecnaOcena(u) > 2.5){
            System.out.println("Dobar");
        }
        else if(prosecnaOcena(u) > 1.5){
            System.out.println("Dovoljan");
        }
        else{
            System.out.println("Nema ocena u dnevniku");
        }

    }


}
