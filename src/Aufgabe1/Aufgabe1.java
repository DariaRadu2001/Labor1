package Aufgabe1;

public class Aufgabe1 {

    /**
     *
     * @param noten
     * @return ein Array von Noten die kleiner als 38 sind
     * Ich durchquerre den Array von Noten und erledige ein neues Array mit den nichtgenugenden(<38) Noten
     */
    public int[] nicht_genug(int[] noten)
    {
        //Exception, wenn das Array leer ist
        if(noten.length == 0)
            throw new IndexOutOfBoundsException("Sie haben keine Noten.");

        int count = 0;
        int count2 = 0;

        //ich zahle wv. Noten nicht genug sind, um die Dimensions des Arrays zu wissen
        for (int j : noten) {
            //Exception, wenn eine Note negativ ist
            if (j < 0)
                throw new IllegalArgumentException("Negative Noten konnen nicht in dem Array sein.");

            if (j < 38)
                count++;
        }

        int[] ergebnis = new int[count];

        //ich erstelle den Array mit nicht zufriedenen Noten
        for (int j : noten) {
            if (j < 38) {
                ergebnis[count2] = j;
                count2++;
            }
        }
        return ergebnis;
    }

    /**
     *
     * @param noten
     * @return die arithmetische Mittel der Noten
     * Ich durchquerre den Array und berechne die Summe aller Noten und danach dividiere sie mit dem Anzahl von Entitaten in dem Array
     */
    public double durchschnitt(int[] noten)
    {
        //Exception, wenn das Array leer ist
        if(noten.length == 0)
            throw new IndexOutOfBoundsException("Sie haben keine Noten.");

        double summe = 0;
        //ich berechne die Summe des Arrays und mache die Aritmetische Mittel
        for (int j : noten) {
            //Exception, wenn eine Note negativ ist
            if (j < 0)
                throw new IllegalArgumentException("Negative Noten konnen nicht in dem Array sein.");

            summe += j;
        }
        return summe/noten.length;
    }

    /**
     *
     * @param noten
     * @return ein Array von Noten die gerunden sind
     * Ich durchquerre den Array von Noten und erledige den Prozzes von Runden, wo es moglich ist
     */
    public int[] runden(int[] noten)
    {
        //Exception, wenn das Array leer ist
        if(noten.length == 0)
            throw new IndexOutOfBoundsException("Sie haben keine Noten.");

        int[] ergebnis = new int[noten.length] ;
        //ich durchlaufe das Array
        for (int i = 0; i < noten.length; i++)
        {
            //Exception, wenn eine Note negativ ist
            if(noten[i] < 0)
                throw new IllegalArgumentException("Negative Noten konnen nicht in dem Array sein.");

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

    /**
     *
     * @param noten
     * @return die grosste Note die auch gerundet wurde
     * Ich durchquerre den Array von Noten und erledige ein neues Array mit den nichtgenugenden(<38) Noten
     */
    public int max_runden(int[] noten)
    {
        //Exception, wenn das Array leer ist
        if(noten.length == 0)
            throw new IndexOutOfBoundsException("Sie haben keine Noten.");

        int max = Integer.MIN_VALUE;
        for (int j : noten) {
            //Exception, wenn eine Note negativ ist
            if (j < 0)
                throw new IllegalArgumentException("Negative Noten konnen nicht in dem Array sein.");

            //ich runde die Liste und wo ich runde, prufe ich ob das gerundete Zahl das grosste ist
            if (j >= 38) {
                if (j % 5 != 0) {
                    int diff = (j / 5 + 1) * 5 - j;
                    if (diff < 3)
                        if ((j / 5 + 1) * 5 > max)
                            max = (j / 5 + 1) * 5;
                }

            }
        }

        return max;
    }



}
