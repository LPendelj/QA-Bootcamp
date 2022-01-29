import java.util.Scanner;

public class MetodeDrugiZadatak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Proizvod je " + pomnozi(a, b));


    }


    public static int pomnozi(int a, int b){

        return a*b;
    }
}
