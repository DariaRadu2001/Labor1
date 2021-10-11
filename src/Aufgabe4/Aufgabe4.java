package Aufgabe4;
import java.lang.Math;

public class Aufgabe4 {

    /*1.
    Vorbedinung: ein Array mit Preise von Tastaturen
    Nachbedinung: die billigste Tastatur
    Ich durchquerre den Array von Preisen und suche den billigsten Wert
   */
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

    /*2.
    Vorbedinung: ein Array mit Preise von Tastaturen und ein Array mit Preise von USB's
    Nachbedinung: der grosster Wert von den Arrays
    Ich durchquerre beiden Arrays und suche die grossten Werten
   */
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

    /*3.
    Vorbedinung: ein Array mit Preise von USB's und ein Buget
    Nachbedinung: der grosster Wert von dem Array der auch im Buget ist
    Ich durchquerre den Array und suche den grossten Wert der <= als dem Buget ist
   */
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

    /*4.
   Vorbedinung: ein Array mit Preise von USB's, ein Array mit Preisen von Tastaturen und ein Buget
   Nachbedinung: den Preis von eine Tastatur und USB's(soll sehr nahe der Buget sein) oder -1, wenn man beiden nicht kaufen kann

   */
    public int buget_preisliste(int buget, int[] tastatur, int[] USB)
    {
        int preis = -1;
        int summe = 0;
        int i = -1;
        int pret_tastatura = buget_USB(buget, tastatur);
        int pret_USB = -1;
        boolean gasit = false;
        do {
            i++;
            summe = buget - pret_tastatura;
            if(summe <= 0)
            {
                pret_tastatura = tastatur[i];
            }
            else
            {
                pret_USB = -1;
                for(int j = 0; j < USB.length; j++)
                {
                    if(USB[j] <= summe && pret_USB < USB[j])
                        pret_USB = USB[j];

                }
                if(pret_USB != -1 && pret_USB+pret_tastatura <= buget)
                    gasit = true;
            }
        }while(!gasit && i < tastatur.length);

        return preis;
    }
}
