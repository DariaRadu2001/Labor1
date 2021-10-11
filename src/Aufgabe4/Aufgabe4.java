package Aufgabe4;
import java.lang.Math;

public class Aufgabe4 {

    //1.ich suche das minimale Wert in der Array von Preise der Tastaturen
    public int billige_tastatur(int[] tastatur)
    {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < tastatur.length; i++)
        {
            if(tastatur[i] < min)
                min = tastatur[i];
        }
        return min;
    }

    //2.
    public int teuesten(int[] tastatur , int[] USB)
    {
        int max_tastatur = Integer.MIN_VALUE;
        int max_USB = Integer.MIN_VALUE;

        //ich suche das maximale Wert in der Array von Preise der Tastaturen
        for(int i = 0; i < tastatur.length; i++)
        {
            if(tastatur[i] > max_tastatur)
                max_tastatur = tastatur[i];
        }

        //1.ich suche das maximale Wert in der Array von Preise der USB's
        for(int i = 0; i < USB.length; i++)
        {
            if(USB[i] > max_USB)
                max_USB = USB[i];
        }

        //ich verwende die max methode von Math Bibliothek, um den maximalen Wert zw. die Zwei zu finden
        return Math.max(max_tastatur, max_USB);
    }

    //3.ich suche das maximale Wert in der Array von Preise der USB's der auch <= das Buget ist
    public int buget_USB(int buget, int[] USB)
    {
        int max_USB = Integer.MIN_VALUE;

        for(int i = 0; i < USB.length; i++)
        {
            if(USB[i] > max_USB && USB[i] <= buget)
                max_USB = USB[i];
        }

        return max_USB;
    }

    //4. nu-i gata sadface
    public int buget_preisliste(int buget, int[] tastatur, int[] USB)
    {
        int preis = -1;
        int summe = 0;

        return preis;
    }
}
