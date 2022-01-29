package domaciZadaci2;

public class Sportista {
    private String imePrezime;
    private String sport;
    private String klub;
    private int broj;


    public Sportista(String imePrezime, String sport, String klub, int broj) {
        this.imePrezime = imePrezime;
        this.sport = sport;
        this.klub = klub;
        if(broj<0&&broj>99){
            System.out.println("Ne mozete uneti takav broj");
        }
        this.broj = broj;
    }

    public String getImePrezime() {
        return imePrezime;
    }



    public String getSport() {
        return sport;
    }



    public String getKlub() {
        return klub;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }
}
