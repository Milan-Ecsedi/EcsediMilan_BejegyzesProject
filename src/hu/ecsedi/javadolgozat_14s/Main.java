package hu.ecsedi.javadolgozat_14s;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bejegyzes bejegyzes= new Bejegyzes("Boros Ádám","Elmentem egy állatkertbe" );
        Bejegyzes bejegyzes1=new Bejegyzes("Atek Lídia", "Alapjában véve az euklid nem számít veszélyesnek...");
        Bejegyzes bejegyzes2=new Bejegyzes("Máté Benedek", "Robbanás veszély Zedországban!");

        ArrayList<Bejegyzes> Lista = new ArrayList<Bejegyzes>();
        Lista.add(bejegyzes);
        Lista.add(bejegyzes1);
        Lista.add(bejegyzes2);

        System.out.printf("Adja meg mennyi bejegyzést szeretne látni: ");

        Scanner sc=new Scanner(System.in);

        int mennyiseg= sc.nextInt();

        for (int i=0; i<mennyiseg; i++){

            System.out.printf(String.valueOf(Lista.get(i))+"\n");

        }






    }
}
