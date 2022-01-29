package domaciZadaci3;

import java.util.ArrayList;

public class ArrayListImplementacija {
    public static void main(String[] args) {
        /*-u listu dodajte vase omiljene iteme tog hobija (npr koji su omiljeni sportovi)
                -iz liste dohvatite 3. element liste i ispisite
        -promenite naziv prvog elementa
                -uklonite 5. element
                -ispisite velicinu vase liste
                -pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste*/
        ArrayList<String> sport = new ArrayList<>();
        sport.add("Fudbal");
        sport.add("Kosarka");
        sport.add("Vaterpolo");
        sport.add("Plivanje");
        sport.add("Atletika");
        sport.add("Odbojka");
        sport.add("Rukomet");

        System.out.println(sport.get(2));

        sport.set(0, "Tenis");

        sport.remove(4);

        System.out.println(sport.size());

        System.out.println("for loop:");

        for(int i = 0; i< sport.size(); i++){
            System.out.println(sport.get(i));
        }

        System.out.println("enhanced for loop:");

        for(String s:sport){
            System.out.println(s);
        }


    }



}
