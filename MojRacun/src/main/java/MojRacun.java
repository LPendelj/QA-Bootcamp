import java.util.Scanner;

public class MojRacun {
    public static void main(String[] args) {
       /* [MojNovcanik]
        MojNovcanik je CLI (Command Line Interface) aplikacija koja omogucava da lakse upravljate
        vasim bankovnim racunima, skladisti podatke o prilivu i odlivu novca, menjate novac ...
        Ideja je da napravite aplikaciju slicno onim mobilnim aplikacijama banki (ako koristite neku od njih,
        slobodno se vodite time). Kada se pokrene aplikacija "otvara se" (ispisuje u konzolu) glavni meni gde:
        - Sign up: Korisnik moze da kreira nalog (Username, Password, ...)
[Opciono] Kada napravite nalog, sacuvajte sve relevantne informacije u neku excel tablu (automtaski preko jave)
                - Login: Korisnik se uloguje u aplikacije
        Nakon sto se korisnik uloguje, aplikacija treba da prikaze meni sa raznim opcijam. Te opcije moraju da omogucuju
        da korisnik moze da napravi novi racun u nekoj banci, ukine racun, da moze da pristupi nekom racunu kako da doda novac na njega,
                tako i da skine neku sumu sa njega, promeni valutu ...
        Aplikacija treba da omogucava da korisnik moze da koristi svoje racune da placa razne stvari: kupuje odecu,
        plati gorivo na pumpi, plati infostan .... Aplikacija tada treba da pamti sve relevantne stavi sa tih tranzakcija:
        sa kog racuna je placeno, koliko novca, koja je kateogirja tranzakcije (racun, zabava, hrana ...).
        Aplikacija treba da cuva ove podatke i da omogucava korisniku da prelistava kroz njih. Napraviti i nekakav
        "filter" sistem koji recimo ispisuje sve tranzakcije iz kategorije "hrana" ...
[Opciono] Sacuvati sve ove podatke u neku excel tabelu. Za svakog korisnika koristi jedan poseban sheet
        Aplikacija ne sme da se zavrsava nakon sto korisnik odradi sa njom nesto vec mora da omogucava korisniku
        da ponovo izabere neku opciju. Aplikacija se zavrsava samo tako sto korisnik PREKO KONZOLE joj kaze da izadje
                (dakle ne pritiskom na stop dugme ili pomocu CTRL+D komande, vec preko isprogramiranog meni-a).
                Kako je aplikacija slozena, bilo bi lepo da je sve organizovano u nekim podmenu-ima i omoguciti "Back" opciju
        koja korisnika vraca na prethodni meni.
        Aplikaciju praviti u novom projektu i sve klase lepo organizovati u pakete.
        Dokle god aplikacija prati generalnu pricu projekta, mozete da je pravite kako god, ali potrudite se da sam kod,
                kao i funkcionalnosti aplikacije budu sto profesionalnije izkodirani!
                Kada zavrsite projekat, dodajte jedan .txt fajl gde opisujete, prvo uopsteno, sta sve moze vasa aplikacija, pa onda
        kako i sta pojedinacne stvari radi.
        Kako bi meni sto vise olaksali posao pregledanja, ne bi bilo lose da pred svaku klasu i metodu ispisete komentar
        sta tacno ona radi. Iako nema potrebe da bude tog nivao, pogledajte recimo kako su ispisani komentari u javinoj klasi ArrayList.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("""
                    Izaberite jednu od opcija:
                    0. Izlaz iz programa.
                    1. Sign up
                    2. Log in""");

        boolean izlaz = false;
        while (!izlaz){
            System.out.println("Glavni meni");
            izlaz = true;
        }


    }
}
