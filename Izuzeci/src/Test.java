    public class Test {
        public static void main(String[] args) {
            try {
                NekaKlasa nk = new NekaKlasa(-1, 2);
               // System.out.println("Sve ok");
            }
            catch(ArithmeticException greska){
                System.out.println(greska.getMessage());
            }
            catch (BGreska greska){
                System.out.println(greska.getMessage());
            }
            System.out.println("Kraj programa");
        }

}
