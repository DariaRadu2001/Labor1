package Aufgabe1;

public class Aufgabe1 {

    //1.
    public int[] nicht_genug(int[] noten)
    {
        int count = 0;
        int count2 = 0;

        //ich zahle wv. Noten nicht genug sind, um die Dimensions des Arrays zu wissen
        for (int i = 0; i < noten.length; i++)
        {
            if (noten[i] < 38)
                count++;
        }

        int[] ergebnis = new int[count];

        //ich erstelle den Array mit nicht zufriedenen Noten
        for (int i = 0; i < noten.length; i++)
        {
            if (noten[i] < 38)
            {
                ergebnis[count2] = noten[i];
                count2++;
            }
        }
        return ergebnis;
    }

    //2.
    public double durchschnitt(int[] noten)
    {
        double durchschnitt = 0;
        double summe = 0;
        //ich berechne die Summe des Arrays und mache die Aritmetische Mittel
        for (int i = 0; i < noten.length; i++)
        {
            summe += noten[i];
        }
        return summe/noten.length;
    }

    //3.
    public int[] runden(int[] noten)
    {
        int[] ergebnis = new int[noten.length] ;
        //ich durchlaufe das Array
        for (int i = 0; i < noten.length; i++)
        {
            //die Note ist kleiner als 38 => kann nicht runden
            if (noten[i] < 38)
            {
                ergebnis[i] = noten[i];
            }

            //die Note ist grosser als 38 => kann runden
            if(noten[i] >= 38)
            {
                if(noten[i]%5 != 0)
                {
                    //ich berechne die Differenz zw. die Note und dem nachsten Vielfach von 5
                    int diff = (noten[i]/5+1)*5 - noten[i];
                    //System.out.println("Diferenta la " + noten[i] + " este " + diff);
                    if(diff < 3)
                        ergebnis[i] = (noten[i]/5+1)*5 ;
                    else
                        ergebnis[i] = noten[i];

                }
                else
                    ergebnis[i] = noten[i];
            }
        }
        return ergebnis;
    }

    //4.
    public int max_runden(int[] noten)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < noten.length; i++)
        {
            //ich runde die Liste und wo ich runde, prufe ich ob das gerundete Zahl das grosste ist
            if(noten[i] >= 38)
            {
                if(noten[i]%5 != 0)
                {
                    int diff = (noten[i]/5+1)*5 - noten[i];
                    if(diff < 3)
                        if((noten[i]/5+1)*5 > max)
                            max = (noten[i]/5+1)*5;
                }

            }
        }

        return max;
    }



}
