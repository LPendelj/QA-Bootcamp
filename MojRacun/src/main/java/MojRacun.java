import korisnik.Korisnik;
import korisnik.SpisakKorisnika;

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

        boolean izlaz1 = false;

        //ArrayList sa spiskom svih korisnika u aplikaciji.
        SpisakKorisnika spisak = new SpisakKorisnika();

        Scanner sc = new Scanner(System.in);
        Korisnik korisnik = new Korisnik();

        while (!izlaz1) {
            System.out.println("""
                    Izaberite jednu od opcija:
                    0. Izlaz iz programa.
                    1. Sign up
                    2. Log in""");
            int izbor = sc.nextInt();
            while (izbor < 0 || izbor > 2) {
                System.out.println("Unesite broj ponovo");
                izbor = sc.nextInt();
            }

            switch (izbor) {
                case 0:
                    System.out.println("Izasli ste iz aplikacije");

                    System.exit(0);
                    break;
                case 1: {
                    System.out.println("Unesite ime i prezime");

                    sc.nextLine();

                    String ime = sc.nextLine();

                    System.out.println("Unesite sifru");

                    String sifra = sc.nextLine();
                    Korisnik k1 = new Korisnik(ime, sifra);
                    spisak.dodajKorisnika(k1);
                    System.out.println("Uspesno ste se registrovali");
                }
                break;
                case 2: {
                    System.out.println("Unesite ime i prezime:");

                    sc.nextLine();

                    String ime = sc.nextLine();


                    System.out.println("Unesite sifru");

                    String sifra = sc.nextLine();

                    for (Korisnik k : spisak.getSpisakKorisnika()) {
                        if (k.getFullName().equals(ime) && k.getSifra().equals(sifra)) {
                            System.out.println("Uspesno ste se ulogovali");
                            korisnik = k;
                            izlaz1 = true;
                        } else System.out.println("Niste uneli tacne podatke. Pokusajte ponovo");
                    }

                }
            }
        }

        //Provera spiska
        for (Korisnik k : spisak.getSpisakKorisnika()) System.out.println(k.getKorisnickoIme());

        boolean izlaz2 = false;
        while (!izlaz2) {
            System.out.println("Glavni meni");
            System.out.println("""
                    Izaberite jednu od opcija:
                    0. Izlaz iz programa.
                    1. Proverite stanje racuna
                    2. Izvrsite kupovinu
                    3. Novo placanje
                    4. Spisak transakcija
                    5. Promenite novac
                                        
                                        
                    """);
            int izbor = sc.nextInt();
            while (izbor < 0 || izbor > 7) {
                System.out.println("Unesite broj ponovo");
                izbor = sc.nextInt();
            }
            switch (izbor) {
                case 0:
                    System.out.println("Izasli ste iz aplikacije");

                    System.exit(0);
                    break;
                case 1:   korisnik.proveriRacun(korisnik.getKorisnickoIme());
                    break;
                case 2:   //korisnik.izvrsiKupovinu();
                    break;
                case 3:     //korisnik.novoPlacanje();
                    break;
                case 4:     korisnik.getRacun().getTransakcije();
                    break;
                case 5:    //korisnik.promeniteNovac();
                    break;
                default:
                    izlaz2 = true;
            }


        }
    }

}