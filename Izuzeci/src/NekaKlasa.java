
    public class NekaKlasa {
        private int a;
        private int b;

        public NekaKlasa(int a, int b) throws ArithmeticException {
            if(a < 0){
                ArithmeticException ae = new ArithmeticException("A ne sme da bude manje od 0");
                throw ae;
            } else  this.a = a;

            if(b < 0){
                ArithmeticException ae = new ArithmeticException("B ne sme da bude manja od 0");
                throw ae;
            } else this.b = b;
        }

}
