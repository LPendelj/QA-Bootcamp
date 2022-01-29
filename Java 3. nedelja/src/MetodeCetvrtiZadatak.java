import org.w3c.dom.ls.LSOutput;

public class MetodeCetvrtiZadatak {
    public static void main(String[] args) {
        //Zadatak 3 - U Main metodi treba proslediti godine i ispisati da li je osoba punoletna ili ne,
//koristiti drugu metodu za racunanje


       punoletstvoGodina(2003);

        System.out.println(punoletstvoString(17));

        System.out.println("-----------------------for petlja--------------------------------");

       for(int i = 15;i<22;i++) punoletstvo(i);



    }


    public static void punoletstvo(int a){
        if(a<0){
            System.out.println("Unet je negativan broj");
        } else if(a<18){
            System.out.println("Osoba je maloletna");
        } else System.out.println("Osoba je punoletna");

    }

    public static void punoletstvoGodina(int godina){

        int a=2021 - godina;

        if(a<0){
            System.out.println("Unet je negativan broj");
        } else if(a<18){
            System.out.println("Osoba je maloletna");
        } else System.out.println("Osoba je punoletna");

    }
    public static String punoletstvoString(int a){
        String b;

        if(a<0){
            b = "Unet je negativan broj";
        } else if(a<18){
            b = "Osoba je maloletna";
        } else b = "Osoba je punoletna";

        return b;
    }


}
