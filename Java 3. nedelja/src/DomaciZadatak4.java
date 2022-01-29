import java.util.Scanner;

public class DomaciZadatak4 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            int[] niz = {1,2,3,4,5,6,7,8,9,10};
            int[] niz2 = new int[niz.length];


        int j = 0;

        for(int i = niz.length-1; i>=0; i-=3) {
            if(i < 0) {
               break;
            } else niz2[j] = niz[i];
            j++;
        }

        for(int i = 0; i<j; i++) {

                System.out.println(niz2[i]);

        }

        }
    }

