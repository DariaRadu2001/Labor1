package Aufgabe2;

public class Aufgabe2 {

    /*1.
    Vorbedinung: ein Array von Zahlen
    Nachbedinung: die maximale Zahl
    Ich durchquerre den Array von Zahlen und suche den grossten Wert
    */
    public int max(int[] zahlen)
    {
        //ich durchqueere die Liste und suche das maximale Wert
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < zahlen.length; i++)
        {
            if(zahlen[i] > max)
                max = zahlen[i];
        }
        return max;
    }

    /*2.
    Vorbedinung: ein Array von Zahlen
    Nachbedinung: die minimale Zahl
    Ich durchquerre den Array von Zahlen und suche den kleinsten Wert
    */
    public int min(int[] zahlen)
    {
        //ich durchqueere die Liste und suche das minimale Wert
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < zahlen.length; i++)
        {
            if(zahlen[i] < min)
                min = zahlen[i];
        }
        return min;
    }

    /*
    Vorbedinung: ein Array von Zahlen
    Nachbedinung: die Summe der Zahlen
    Ich durchquerre den Array von Zahlen und berechne die Summe
    */
    public int summe(int[] zahlen)
    {
        //ich berechne die Summer der Zahlen
        int summe = 0;
        for(int i = 0; i < zahlen.length; i++)
        {
            summe += zahlen[i];
        }
        return summe;
    }

    /*3.
    Vorbedinung: ein Array von Zahlen
    Nachbedinung: die maximale Summe von n-1 Zahlen
    Ich erledige die Summe mit der "summe" Methode un subtrahiere den minimalen Wert
    */
    public int max_summe(int[] zahlen)
    {
        //ich berechne die Summe mit der summe Methode und subtrahiere den minimalen Wert des Arrays
        int summe = summe(zahlen);
        int min = min(zahlen);
        return summe - min;
    }

    /*4.
    Vorbedinung: ein Array von Zahlen
    Nachbedinung: die minimale Summe von n-1 Zahlen
    Ich erledige die Summe mit der "summe" Methode un subtrahiere den maximalen Wert
    */
    public int min_summe(int[] zahlen)
    {
        //ich berechne die Summe mit der summe Methode und subtrahiere den maximalen Wert des Arrays
        int summe = summe(zahlen);
        int max = max(zahlen);
        return summe - max;
    }


}
