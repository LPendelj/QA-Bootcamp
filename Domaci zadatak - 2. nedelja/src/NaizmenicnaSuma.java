import java.util.Scanner;

public class NaizmenicnaSuma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("unesite poslednji broj intervala");
        int m = sc.nextInt();


        int s = 0;

        for (int i = 0; i<m; i++){
            if (i%2==0){
                s+=i;
            } else s-=i;
        }
        System.out.println("Rezultat naizmecne sume je " + s);

    }
}
