package Aufgabe3;

public class Aufgabe3 {

    /**
     *
     * @param zahl1
     * @param zahl2
     * @return ein Array von Ziffern, die Summe der zwei Zahlen
     * Ich erledige von rechts nach links die Summe jeden zwei Ziffern die sich auf der selben Position befinden
     */

    public int[] summe(int[] zahl1, int[] zahl2)
    {
        //Exception, wenn die Arrays leer sind
        if(zahl1.length == 0 || zahl2.length == 0)
            throw new IndexOutOfBoundsException("Sie haben keine Zahlen.");

        //Exception, wenn Lange Zahl1 != Lange Zahl2
        if(zahl1.length != zahl2.length)
            throw new IndexOutOfBoundsException("Sie haben keine Zahlen mit derselben Lange.");

        //ich habe ein Array mit eine grossere lange mit 1 als die gegebenen Zahlen
        int[] summe = new int[zahl1.length + 1];
        summe[0] = 0;
        //Die Variable plus verwende ich um den Overflow zu errinern
        int plus = 0;
        //ich berechne die Summe von rechts nach links
        for(int i = zahl1.length - 1; i >= 0; i--)
        {
            //wenn es ein Overflow gibt, dann addiere ich es in der Summe zw. die 2 Ziffern die sich auf dem selben Position befinden
            if(plus >= 1)
            {
                summe[i+1] = (zahl1[i] + zahl2[i]+ plus)%10 ;
            }
            else
                summe[i+1] = (zahl1[i] + zahl2[i])%10;
            //wenn die Summe grosser als 9 ist, dann erinnere ich den Overflow
            if((zahl1[i] + zahl2[i] + plus)>9)
                plus = (zahl1[i] + zahl2[i] + plus)/10;
            else
                plus = 0;

        }
        if(plus >= 1)
            summe[0] = plus;

        //ich mache eine kleinere Kopie des Ergebnis Array
        if(summe[0] == 0)
        {
            int[] summe2 = new int[zahl1.length];
            System.arraycopy(summe, 1, summe2, 0, zahl1.length - 1 + 1);
            return summe2;
        }
        return summe;
    }

    /**
     *
     * @param zahl1
     * @param zahl2
     * @return ein Array von Ziffern, die Differenz der zwei Zahlen
     * @throws Exception, wenn ein Array leer ist, wenn die Arrays von verschiedenen Langen sind
     *                  ,wenn zahl1 < zahl2 ist
     * Ich erledige von rechts nach links die Differenz jeden zwei Ziffern die sich auf der selben Position befinden
     */
    public int[] differenz(int[] zahl1, int[] zahl2) throws Exception {
        //Exception, wenn die Arrays leer sind
        if(zahl1.length == 0 || zahl2.length == 0)
            throw new IndexOutOfBoundsException("Sie haben keine Zahlen.");

        //Exception, wenn Lange Zahl1 != Lange Zahl2
        if(zahl1.length != zahl2.length)
            throw new IndexOutOfBoundsException("Sie haben keine Zahlen mit derselben Lange.");

        //Exception, wenn Zahl1 < Zahl2
        if(zahl1[0] < zahl2[0])
            throw new Exception("Zahl1 kann nicht kleiner als Zahl2 sein");

        int[] differenz = new int[zahl1.length];
        differenz[0] = 0;
        int minus;
        //ich berechne die Differenz von rechts nach links
        for(int i = zahl1.length - 1; i >= 0; i--)
        {
            //minus ist eine Variable indem ich die Differenz zw. die 2 Zahlen speichere
            minus = zahl1[i] - zahl2[i];
            //wenn minus negativ ist, dann muss ich die mathematische Sache tun, indem ich von der Ziffer bevor 1 nehme
            if(minus < 0)
            {
                zahl1[i - 1] --;
                differenz[i] = 10+zahl1[i] - zahl2[i];
            }
            else
                differenz[i] = minus;

        }

        return differenz;

    }


    /**
     *
     * @param zahl
     * @param ziffer
     * @return ein Array von Ziffern, die Multiplikation zwischen Zahl und Ziffer
     * Ich erledige von rechts nach links die Multiplikation jeder Ziffer mit dem Ziffer gegeben als Parameter
     */
    public int[] multiplikation(int[] zahl, int ziffer)
    {

        //Exception, wenn das Array leer ist
        if(zahl.length == 0)
            throw new IndexOutOfBoundsException("Sie haben keine Zahl.");

        //Exception, wenn wir keine gultige Ziffer bekommen
        if(ziffer <= 0 || ziffer > 9)
            throw new IllegalArgumentException("Die gegebene Ziffer ist nicht gultig");

        int[] mul = new int[zahl.length + 1];

        mul[0] = 0;
        //Die Variable plus verwende ich um den Overflow zu errinern
        int plus = 0;
        for(int i = zahl.length - 1; i >= 0; i--)
        {
            //wenn es ein Overflow gibt, dann addiere ich es in der Multiplikation zw. die 2 Ziffern die sich auf dem selben Position befinden
            if(plus >= 1)
            {
                mul[i+1] = (zahl[i]*ziffer + plus)%10 ;
            }
            else
                mul[i+1] = (zahl[i]*ziffer)%10;

            //wenn die Berechnung grosser als 9 ist, dann erinnere ich den Overflow
            if((zahl[i]*ziffer + plus)>9)
                plus = (zahl[i]*ziffer + plus)/10;
            else
                plus = 0;

        }
        //Overflow gibt noch, dann soll ich dn plus Variable am Anfang des Arrays tun
        if(plus >= 1)
            mul[0] = plus;

        //ich mache eine kleinere Kopie des Ergebnis Array
        if(mul[0] == 0)
        {
            int[] mul2 = new int[zahl.length];
            System.arraycopy(mul, 1, mul2, 0, zahl.length - 1 + 1);
            return mul2;
        }
        return mul;
    }


    /**
     *
     * @param zahl
     * @param ziffer
     * @return ein Array von Ziffern, die Division zwischen Zahl und Ziffer
     *  Ich erledige von links nach rechts die Division jeder Ziffer mit dem Ziffer gegeben als Parameter
     */
    public int[] division(int[] zahl, int ziffer)
    {

        //Exception, wenn das Array leer ist
        if(zahl.length == 0)
            throw new IndexOutOfBoundsException("Sie haben keine Zahl.");

        //Exception, wenn wir keine gultige Ziffer bekommen
        if(ziffer <= 0 || ziffer > 9)
            throw new IllegalArgumentException("Die gegebene Ziffer ist nicht gultig");

        int[] div = new int[zahl.length];
        div[0] = 0;
        //in die Variable nr habe ich dem Zahl mitedem ich dividieren soll
        int nr = 0;
        for(int i = 0; i < zahl.length ; i ++)
        {
            //ich berechne immen nr, weil manchmal ein Rest bleiben kann, das eigentlich im nr ist
            nr = nr*10 + zahl[i];
            div[i] = nr/ziffer;
            //hier berechne ich dem Rest
            nr = nr%ziffer;
        }

        //ich mache eine kleinere Kopie des Ergebnis Array
        if(div[0] == 0)
        {
            int[] div2 = new int[div.length - 1];
            System.arraycopy(div, 1, div2, 0, div2.length - 1 + 1);
            return div2;
        }

        return div;
    }
}
