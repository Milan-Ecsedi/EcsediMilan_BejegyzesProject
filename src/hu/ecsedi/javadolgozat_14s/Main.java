package hu.ecsedi.javadolgozat_14s;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bejegyzes bejegyzes= new Bejegyzes("Boros Ádám","Elmentem egy állatkertbe és kiderült hogy a porcsin nem állat :(( " );
        Bejegyzes bejegyzes1=new Bejegyzes("Atek Lídia", "Alapjában véve az euklid nem számít veszélyesnek de attól függetlenül elzárva kell tartani (SCP document)...");


        ArrayList<Bejegyzes> Lista = new ArrayList<Bejegyzes>();
        Lista.add(bejegyzes);
        Lista.add(bejegyzes1);


        System.out.printf("Adja meg mennyi bejegyzést szeretne látni: ");

        Scanner sc=new Scanner(System.in);

        int mennyiseg= sc.nextInt();

        if (mennyiseg<0){

            throw new NumberFormatException("Nem természetes számot adott meg");

        }

        for (int i=0; i<mennyiseg; i++){

            System.out.printf(String.valueOf(Lista.get(i))+"\n");

        }






    }
}
