package javaKlase;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj krugova u nizu");

        int brojKrugova = sc.nextInt();



       try {
            Krug[] nizKrugova = new Krug[brojKrugova];
       }
       catch (Exception e){
           System.out.println("Unet je negativan broj.");
       }



          /*  for(int i=0; i<brojKrugova; i++){
                System.out.println("Unesite poluprecnik " + (i+1) + ". kruga.");
                double poluprecnik = sc.nextDouble();

               // nizKrugova[i] = new Krug(poluprecnik);

            }

        for(int i=0; i<brojKrugova; i++){

            System.out.println("Povrsina kruga " + (i+1) + ". je " + nizKrugova[i].povrsina());
            System.out.println("Obim kruga " + (i+1) + ". je " + nizKrugova[i].obim());

        }*/




    }
}
