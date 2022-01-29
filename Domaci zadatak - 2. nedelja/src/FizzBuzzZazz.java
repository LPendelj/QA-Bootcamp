import java.util.Scanner;

public class FizzBuzzZazz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj");
        int broj = sc.nextInt();

        for(int i = 1; i<=broj; i++) {

            if (i%7==0 && i%5==0 && i%3==0)  {
                System.out.println("FizzBuzzZazz");

            } else

            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");

            } else

            if (i%7==0 && i%3==0) {
                System.out.println("FizzZazz");

            } else
            if (i%7==0 && i%5==0) {
                System.out.println("BuzzZazz");

            } else if (i%7==0) {
                System.out.println("Zazz");

            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");

            } else {

                System.out.println(i);
            }

        }




    }

}
