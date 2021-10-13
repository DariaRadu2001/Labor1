package Labor1;
import Aufgabe1.Aufgabe1;

import Aufgabe2.Aufgabe2;
import Aufgabe3.Aufgabe3;
import Aufgabe4.Aufgabe4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        //Aufgabe1

        //ich erstelle ein neues Objekt der Typ Aufgabe1
        Aufgabe1 liste = new Aufgabe1();
        int[] noten = new int[] {34, 67, 20, 38, 37, 53, 90, 22, 46, 40, 27, 33, 48};
        System.out.println("Aufgabe1 1 --- nicht ausreichendes Array = " + Arrays.toString(liste.nicht_genug(noten)));
        System.out.println("Aufgabe1 2 --- Durchschnittsnote = " + liste.durchschnitt(noten));
        System.out.println("Aufgabe1 3 --- Array mit abgerundeten Noten = " + Arrays.toString(liste.runden(noten)));
        System.out.println("Aufgabe1 4 --- die maximale abgerundete Note = " + liste.max_runden(noten));


        //Aufgabe2
        int n = 0;
        //ich verwende die Scanner Bibliothek, um Werte vom Tastatur zu lesen
        Scanner keyboard = new Scanner(System.in);
        //n soll positiv sein
        while(n <= 0)
        {
            System.out.println("n=");
            n = keyboard.nextInt();
        }
        //ich erstelle ein neues Objekt der Typ Aufgabe2
        Aufgabe2 liste2 = new Aufgabe2();
        int[] zahlen = new int[n];
        //ich lese n Zahlen
        for(int i = 0; i < n; i++)
        {
            System.out.println("zahl[" + i + "]=");
            zahlen[i] = keyboard.nextInt();
        }
        System.out.println("Liste von Zahlen: " + Arrays.toString(zahlen));
        System.out.println("Aufgabe2 1 --- maximale Zahl = " + liste2.max(zahlen));
        System.out.println("Aufgabe2 2 --- minimale Zahl = " + liste2.min(zahlen));
        System.out.println("Aufgabe2 3 --- maximale Summe = " + liste2.max_summe(zahlen));
        System.out.println("Aufgabe2 4 --- minimale Summe = 0" + liste2.min_summe(zahlen));

        //Aufgabe3

        int[] zahl1 = new int[] {7,8,3,4,0};
        int[] zahl2 = new int[] {5,0,6,0,0};
        int ziffer = -1;
        //ziffer ist zw. 1 und 9
        while(ziffer<=0 || ziffer>9)
        {
            System.out.println("Ziffer=");
            ziffer = keyboard.nextInt();
        }
        //ich erstelle ein neues Objekt der Typ Aufgabe3
        Aufgabe3 liste3 = new Aufgabe3();
        System.out.println("Aufgabe3 1 --- Summe = " + Arrays.toString(liste3.summe(zahl1, zahl2)));
        System.out.println("Aufgabe3 2 --- Differenz = " + Arrays.toString(liste3.differenz(zahl1, zahl2)));
        int[] zahl = new int[] {2,3,7,0,0,0};
        System.out.println("Aufgabe3 3 --- Multiplikation = " + Arrays.toString(liste3.multiplikation(zahl, ziffer)));
        System.out.println("Aufgabe3 4 --- Division = " + Arrays.toString(liste3.division(zahl, ziffer)));


        //Aufgabe4

        int[] tastatur = new int[] {40, 35, 70, 15, 45, 60};
        int[] USB = new int[] {29, 67, 11, 20, 38, 37, 80};
        int buget = 0;
        //buget soll positiv sein
        while(buget <= 0)
        {
            System.out.println("buget=");
            buget = keyboard.nextInt();
        }
        //ich erstelle ein neues Objekt der Typ Aufgabe4
        Aufgabe4 liste4 = new Aufgabe4();
        System.out.println("Aufgabe4 1 --- billigste Tastaur = " + liste4.billige_tastatur(tastatur));
        System.out.println("Aufgabe4 2 --- teuerste Gegenstand = " + liste4.teuesten(tastatur, USB));
        System.out.println("Aufgabe4 3 --- buget USB = " + liste4.buget_USB(buget, USB));
        System.out.println("Aufgabe4 4 --- Markus Buget = " + liste4.buget_preisliste(buget, tastatur, USB));

    }

}

