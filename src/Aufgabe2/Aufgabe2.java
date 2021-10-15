package Aufgabe2;

public class Aufgabe2 {

    /**
     *
     * @param zahlen
     * @return die maximale Zahl
     * Ich durchquerre den Array von Zahlen und suche den grossten Wert
     */
    public int max(int[] zahlen)
    {
        //Exception, wenn das Array leer ist
        if(zahlen.length == 0)
            throw new IndexOutOfBoundsException("Sie haben keine Zahlen.");

        //ich durchqueere die Liste und suche das maximale Wert
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < zahlen.length; i++)
        {
            //Exception, wenn eine Zahl negativ ist
            if(zahlen[i] < 0)
                throw new IllegalArgumentException("Negative Zahlen konnen nicht in dem Array sein.");

            if(zahlen[i] > max)
                max = zahlen[i];
        }
        return max;
    }


    /**
     *
     * @param zahlen
     * @return die minimale Zahl
     * Ich durchquerre den Array von Zahlen und suche den kleinsten Wert
     */
    public int min(int[] zahlen)
    {
        //Exception, wenn das Array leer ist
        if(zahlen.length == 0)
            throw new IndexOutOfBoundsException("Sie haben keine Zahlen.");

        //ich durchqueere die Liste und suche das minimale Wert
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < zahlen.length; i++)
        {
            //Exception, wenn eine Zahl negativ ist
            if(zahlen[i] < 0)
                throw new IllegalArgumentException("Negative Zahlen konnen nicht in dem Array sein.");

            if(zahlen[i] < min)
                min = zahlen[i];
        }
        return min;
    }


    /**
     *
     * @param zahlen
     * @return die Summe der Zahlen
     * Ich durchquerre den Array von Zahlen und berechne die Summe
     */
    public int summe(int[] zahlen)
    {
        //Exception, wenn das Array leer ist
        if(zahlen.length == 0)
            throw new IndexOutOfBoundsException("Sie haben keine Zahlen.");

        //ich berechne die Summer der Zahlen
        int summe = 0;
        for(int i = 0; i < zahlen.length; i++)
        {
            //Exception, wenn eine Zahl negativ ist
            if(zahlen[i] < 0)
                throw new IllegalArgumentException("Negative Zahlen konnen nicht in dem Array sein.");
            summe += zahlen[i];
        }
        return summe;
    }

    /**
     *
     * @param zahlen
     * @return die maximale Summe von n-1 Zahlen
     * Ich erledige die Summe mit der "summe" Methode un subtrahiere den minimalen Wert
     */
    public int max_summe(int[] zahlen)
    {
        //Exception, wenn das Array leer ist
        if(zahlen.length == 0)
            throw new IndexOutOfBoundsException("Sie haben keine Zahlen.");

        //ich berechne die Summe mit der summe Methode und subtrahiere den minimalen Wert des Arrays
        int summe = summe(zahlen);
        int min = min(zahlen);
        return summe - min;
    }


    /**
     *
     * @param zahlen
     * @return die minimale Summe von n-1 Zahlen
     * Ich erledige die Summe mit der "summe" Methode un subtrahiere den maximalen Wert
     */
    public int min_summe(int[] zahlen)
    {

        //Exception, wenn das Array leer ist
        if(zahlen.length == 0)
            throw new IndexOutOfBoundsException("Sie haben keine Zahlen.");

        //ich berechne die Summe mit der summe Methode und subtrahiere den maximalen Wert des Arrays
        int summe = summe(zahlen);
        int max = max(zahlen);
        return summe - max;
    }


}
