public class MetodePrviZadatak {
    public static void main(String[] args) {

        ime();
        System.out.println(prezime());

    }

    public static void ime(){
        System.out.println("Luka");
    }

    public static String prezime(){
        String prezime = "Pendelj";
        return prezime;
    }
    //Zadatak 1 - Napraviti void metodu "Ime", u njoj odstampajte ime, tu metodu samo pozvati u Main metodi
//Napraviti String metodu "Prezime" (nije void), u njoj samo uraditi inicijalizaciju prezimena u neki string
//i odraditi return za taj string. U Main metodi odstampati metodu Prezime
}
