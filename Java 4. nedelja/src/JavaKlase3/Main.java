package JavaKlase3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Zivotinja> lista = new ArrayList<Zivotinja>();




        Vuk v = new Vuk("stepski", 129, 3 );

       // v.zvuk();


        Ovca o = new Ovca("beogradska", 108, "kovrdzavo");
        //o.zvuk(4);

       // o.zvuk();

        Lisica l = new Lisica("Azijska", 111);

       // l.zvuk();


        lista.add(o);
        lista.add(v);
        lista.add(o);
        lista.add(l);
        lista.add(v);
        lista.add(o);


        for(Zivotinja z : lista){
                z.zvuk();

        }

    }
}
