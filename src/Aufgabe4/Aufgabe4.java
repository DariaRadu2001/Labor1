package Aufgabe4;
import java.lang.Math;

public class Aufgabe4 {

    /**
     *
     * @param tastatur
     * @return die billigste Tastatur
     * Ich durchquerre den Array von Preisen und suche den billigsten Wert
     */
    public int billige_tastatur(int[] tastatur)
    {
        //Exception, wenn das Array leer ist
        if(tastatur.length == 0)
            throw new IndexOutOfBoundsException("Es gibt keine Tastaturen.");

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < tastatur.length; i++)
        {
            //Exception, wenn ein Preis negativ ist
            if(tastatur[i] < 0)
                throw new IllegalArgumentException("Negative Preise konnen nicht in dem Array sein.");

            if(tastatur[i] < min)
                min = tastatur[i];
        }
        return min;
    }


    /**
     *
     * @param tastatur
     * @param USB
     * @return der grosster Wert von den Arrays
     * Ich durchquerre beiden Arrays und suche die grossten Werten
     */
    public int teuesten(int[] tastatur , int[] USB)
    {
        //Exception, wenn die Arrays leer sind
        if(tastatur.length == 0 || USB.length == 0)
            throw new IndexOutOfBoundsException("Sie konnen nicht die beiden Geraten kaufen.");

        int max_tastatur = Integer.MIN_VALUE;
        int max_USB = Integer.MIN_VALUE;

        //ich suche das maximale Wert in der Array von Preise der Tastaturen
        for(int i = 0; i < tastatur.length; i++)
        {
            //Exception, wenn ein Preis negativ ist
            if(tastatur[i] < 0)
                throw new IllegalArgumentException("Negative Preise konnen nicht in dem Array sein.");

            if(tastatur[i] > max_tastatur)
                max_tastatur = tastatur[i];
        }

        //1.ich suche das maximale Wert in der Array von Preise der USB's
        for(int i = 0; i < USB.length; i++)
        {
            //Exception, wenn ein Preis negativ ist
            if(USB[i] < 0)
                throw new IllegalArgumentException("Negative Preise konnen nicht in dem Array sein.");

            if(USB[i] > max_USB)
                max_USB = USB[i];
        }

        //ich verwende die max methode von Math Bibliothek, um den maximalen Wert zw. die Zwei zu finden
        return Math.max(max_tastatur, max_USB);
    }


    /**
     *
     * @param buget
     * @param USB
     * @return der grosster Wert von dem Array der auch im Buget ist
     * Ich durchquerre den Array und suche den grossten Wert der <= als dem Buget ist
     */
    public int buget_USB(int buget, int[] USB)
    {
        //Exception, wenn das Array leer ist
        if(USB.length == 0)
            throw new IndexOutOfBoundsException("Es gibt keine USB's.");

        //Exception, wenn Buget <= 0
        if(buget <= 0)
            throw new IllegalArgumentException("Sie haben kein Geld.");

        int max_USB = Integer.MIN_VALUE;

        for(int i = 0; i < USB.length; i++)
        {
            //Exception, wenn ein Preis negativ ist
            if(USB[i] < 0)
                throw new IllegalArgumentException("Negative Preise konnen nicht in dem Array sein.");

            if(USB[i] > max_USB && USB[i] <= buget)
                max_USB = USB[i];
        }

        return max_USB;
    }


    /**
     *
     * @param buget
     * @param tastatur
     * @param USB
     * @return den Preis von eine Tastatur und USB's(soll sehr nahe der Buget sein) oder -1, wenn man beiden nicht kaufen kann
     * Ich durchqueere die beiden Listen von Preisen und finde dem besten Match
     */
    public int buget_preisliste(int buget, int[] tastatur, int[] USB)
    {
        //Exception, wenn die Arrays leer sind
        if(tastatur.length == 0 || USB.length == 0)
            throw new IndexOutOfBoundsException("Sie konnnen nicht beide Geraten kaufen.");

        //Exception, wenn Buget <= 0
        if(buget <= 0)
            throw new IllegalArgumentException("Sie haben kein Geld.");

        int preis = -1;
        int summe, index_USB;
        int index_tastatura = 0;
        //ich suche fur jedem Preis der Tastaturen ein Preis von USB
        while(index_tastatura < tastatur.length)
        {
            if(tastatur[index_tastatura] < buget)
            {
                index_USB = 0;
                //wv. bleibt mir fur dem USB
                summe = buget - tastatur[index_tastatura];
                //ich durchqueere die Liste der Preise von USB's und finde das bestes Match
                while(index_USB < USB.length)
                {

                        if(USB[index_USB] <= summe)
                        {
                            if((tastatur[index_tastatura] + USB[index_USB]) > preis)
                                preis = tastatur[index_tastatura] + USB[index_USB];
                        }

                    index_USB++;
                }
            }
            index_tastatura++;
        }

        return preis;
    }
}
