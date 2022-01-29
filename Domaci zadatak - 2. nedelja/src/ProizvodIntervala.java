import java.util.Scanner;

public class ProizvodIntervala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = 0;
        int n = 0;
        int s = 1;

        System.out.println("unesite prvi ceo broj intervala");
        m = sc.nextInt();
        System.out.println("unesite drugi ceo broj intervala");
        n = sc.nextInt();

        if(n>m){
            for(int i =m;i<=n; i++ ) s *= i;
        } else if (n<m){
            for(int i =n;i<=m; i++ ) s *= i;
        } else System.out.println("Morate uneti dva razlicita broja");

        System.out.println("Proizvod svih brojeva izmedju uneta dva broja je " + s);
    }
}
