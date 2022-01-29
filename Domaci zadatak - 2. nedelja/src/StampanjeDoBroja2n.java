import java.util.Scanner;

public class StampanjeDoBroja2n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = 0;

        System.out.println("unesite broj:");
        m = sc.nextInt();

        if(m>0) {
            for (int i = 1; i <= 2*m; i++) {
                System.out.println(i);
            }
        } else for (int i = -1; i >= -14; i--) {
            System.out.println(i);
        }

    }
}
