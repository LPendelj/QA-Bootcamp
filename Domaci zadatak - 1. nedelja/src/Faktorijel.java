import java.util.Scanner;

public class Faktorijel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj:");
        int a = sc.nextInt();
        int b = a;
        int faktorijel = 1;

        for(int i = a; i>0; i--){

                 faktorijel = faktorijel * a;
                 a--;

        }

        System.out.println(b + "! = " + faktorijel);


    }
}
