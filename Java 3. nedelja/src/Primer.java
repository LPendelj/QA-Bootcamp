public class Primer {
    public static void main(String[] args) {

        stampajStatic();

        Primer primer = new Primer();
        primer.stampaj();

    }

    public static void stampajStatic(){
        System.out.println("stampa iz static metoda");
    }

    public void stampaj(){
        System.out.println("stampa iz metoda");
    }
}
