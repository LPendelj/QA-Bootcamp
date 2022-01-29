import java.util.Scanner;

public class HoroskopskiZnak {

        public static void main (String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Unesite mesec rodjenja:");
            String mesec = sc.nextLine();

            System.out.println("Unesite dan rodjenja:");
            int dan = sc.nextInt();




            String znak="A";
            if (mesec.equalsIgnoreCase("Januar")) {
                if (dan < 20)
                    znak = "Jarac";
                else
                    znak = "Vodolija";
            }
            else if (mesec.equalsIgnoreCase("Februar")) {
                if (dan < 19)
                    znak = "Vodolija";
                else
                    znak = "Ribe";
            }
            else if(mesec.equalsIgnoreCase( "Mart")) {
                if (dan < 21)
                    znak = "Ribe";
                else
                    znak = "Ovan";
            }
            else if (mesec.equalsIgnoreCase( "April")) {
                if (dan < 20)
                    znak = "Ovan";
                else
                    znak = "Bik";
            }
            else if (mesec.equalsIgnoreCase( "Maj")) {
                if (dan < 21)
                    znak = "Bik";
                else
                    znak = "Blizanci";
            }
            else if( mesec.equalsIgnoreCase( "Jun")) {
                if (dan < 21)
                    znak = "Blizanci";
                else
                    znak = "Rak";
            }
            else if (mesec.equalsIgnoreCase("Jul")) {
                if (dan < 23)
                    znak = "Rak";
                else
                    znak = "Lav";
            }
            else if( mesec.equalsIgnoreCase("Avgust")) {
                if (dan < 23)
                    znak = "Lav";
                else
                    znak = "Devica";
            }
            else if (mesec.equalsIgnoreCase( "Septembar")) {
                if (dan < 23)
                    znak = "Devica";
                else
                    znak = "Vaga";
            }
            else if (mesec.equalsIgnoreCase( "Oktobar")) {
                if (dan < 23)
                    znak = "Vaga";
                else
                    znak = "Skorpija";
            }
            else if (mesec.equalsIgnoreCase("Novembar")) {
                if (dan < 22)
                    znak = "skorpija";
                else
                    znak = "Strelac";
            }
            else if (mesec.equalsIgnoreCase( "Decembar")) {
                if (dan < 22)
                    znak = "Strelac";
                else
                    znak ="Jarac";
            }
            System.out.println("Vas znak je " + znak);
        }

}

