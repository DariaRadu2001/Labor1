package Aufgabe2;

public class Aufgabe2 {

    //1.
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

    //2.
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

    //3.Die Methode summe verwende ich auch fur Ub3 und Ub4
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

    public int max_summe(int[] zahlen)
    {
        //ich berechne die Summe mit der summe Methode und subtrahiere den minimalen Wert des Arrays
        int summe = summe(zahlen);
        int min = min(zahlen);
        return summe - min;
    }

    //4.
    public int min_summe(int[] zahlen)
    {
        //ich berechne die Summe mit der summe Methode und subtrahiere den maximalen Wert des Arrays
        int summe = summe(zahlen);
        int max = max(zahlen);
        return summe - max;
    }


}
