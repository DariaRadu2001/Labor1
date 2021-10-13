package Aufgabe1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Aufgabe1Test {

    Aufgabe1 liste = new Aufgabe1();
    int[] noten = new int[] {34, 67, 20, 38, 37, 53, 90, 22, 46, 40, 27, 33, 48};//guter Fall
    int[] noten2 = new int[] {34, 67, 20, -38, 37};//- Fall
    int[] noten3 = new int[] {}; //Leer Fall
    int[] noten4 = new int[] {40, 70, 45, 5, 35}; //guter Fall
    int[] noten5 = new int[] {90, 100, 100}; //guter Fall

    int[]nicht_genug = new int[]{34, 20, 37, 22, 27, 33};
    int[]nicht_genug2 = new int[]{5, 35};
    int[]nicht_genug3 = new int[]{};

    int[]runden = new int[]{34, 67, 20, 40, 37, 55, 90, 22, 46, 40, 27, 33, 50};

    @Test
    void nicht_genug() {

        try
        {
            assert(Arrays.equals(liste.nicht_genug(noten), nicht_genug));
        }
        catch(Exception e)
        {
            assert(false);
        }


        try
        {
            liste.nicht_genug(noten2);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            liste.nicht_genug(noten3);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            assert(Arrays.equals(liste.nicht_genug(noten4), nicht_genug2));
        }
        catch(Exception e)
        {
            assert(false);
        }

        try
        {
            assert(Arrays.equals(liste.nicht_genug(noten5), nicht_genug3));
        }
        catch(Exception e)
        {
            assert(false);
        }
    }

    @Test
    void durchschnitt() {

        try
        {
            assertEquals(42.69230769230769, liste.durchschnitt(noten));
        }
        catch(Exception e)
        {
            assert(true);
        }


        try
        {
            liste.durchschnitt(noten2);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            liste.durchschnitt(noten3);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            assertEquals(39, liste.durchschnitt(noten4));
        }
        catch(Exception e)
        {
            assert(false);
        }

    }

    @Test
    void runden() {

        try
        {
            assert(Arrays.equals(liste.runden(noten), runden));
        }
        catch(Exception e)
        {
            assert(false);
        }


        try
        {
            liste.runden(noten2);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            liste.runden(noten3);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            assert(Arrays.equals(liste.runden(noten4), liste.runden(noten4)));
        }
        catch(Exception e)
        {
            assert(false);
        }

        try
        {
            assert(Arrays.equals(liste.runden(noten5), liste.runden(noten5)));
        }
        catch(Exception e)
        {
            assert(false);
        }


    }

    @Test
    void max_runden() {

        try
        {
            assertEquals(55, liste.max_runden(noten));
        }
        catch(Exception e)
        {
            assert(true);
        }


        try
        {
            liste.max_runden(noten2);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            liste.max_runden(noten3);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            assertEquals(Integer.MIN_VALUE, liste.max_runden(noten4));
        }
        catch(Exception e)
        {
            assert(false);
        }
    }

    @Test
    void all_tests() {
        this.nicht_genug();
        this.durchschnitt();
        this.max_runden();
        this.runden();
    }

}