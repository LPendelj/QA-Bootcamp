import java.util.Scanner;

public class JavaGrananje1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Unesi ceo broj:");
        int broj = sc.nextInt();

        if(broj==0){
            System.out.println("Uneta je nula.");
        } else if(broj%2==0) {
            System.out.println("Unet je paran broj.");
        } else System.out.println("Unet je neparan broj.");
    }
}
