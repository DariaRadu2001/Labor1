package Aufgabe3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Aufgabe3Test {

    Aufgabe3 liste = new Aufgabe3();
    int[] zahl1 = new int[] {8,3,0,0,0};
    int[] zahl2 = new int[] {5,4,0,0,0};
    int[] zahl3 = new int[] {};
    int[] zahl4 = new int[] {8,9,9,9};
    int[] zahl5 = new int[] {1,0,0,0};
    int[] zahl6 = new int[] {5,4,0,0,0,0};

    int[] summe = new int[] {1, 3, 7, 0, 0, 0};
    int[] summe2 = new int[] {9,9,9,9};

    int[] diff = new int[] {2,9,0,0,0};
    int[] diff2 = new int[] {7,9,9,9};

    @Test
    void summe() {

        try
        {
            assert(Arrays.equals(liste.summe(zahl1, zahl2), summe));
        }
        catch(Exception e)
        {
            assert(false);
        }

        try
        {
            assert(Arrays.equals(liste.summe(zahl4, zahl5), summe2));
        }
        catch(Exception e)
        {
            assert(false);
        }

        try
        {
           liste.summe(zahl1, zahl3);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            liste.summe(zahl1, zahl6);
        }
        catch(Exception e)
        {
            assert(true);
        }

    }

    @Test
    void differenz() {

        try
        {
            assert(Arrays.equals(liste.differenz(zahl1, zahl2), diff));
        }
        catch(Exception e)
        {
            assert(false);
        }

        try
        {
            assert(Arrays.equals(liste.differenz(zahl4, zahl5), diff2));
        }
        catch(Exception e)
        {
            assert(false);
        }

        try
        {
            liste.differenz(zahl1, zahl3);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            liste.summe(zahl2, zahl1);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            liste.summe(zahl5, zahl6);
        }
        catch(Exception e)
        {
            assert(true);
        }
    }

    @Test
    void multiplikation() {

        try
        {
            assert(Arrays.equals(liste.multiplikation(zahl1, 2), new int[]{1, 6, 6, 0, 0, 0}));
        }
        catch(Exception e)
        {
            assert(false);
        }

        try
        {
            assert(Arrays.equals(liste.multiplikation(zahl5, 5), new int[]{5, 0, 0, 0}));
        }
        catch(Exception e)
        {
            assert(false);
        }

        try
        {
            liste.multiplikation(zahl5, -5);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            liste.multiplikation(zahl5, 100);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            liste.multiplikation(zahl5, 0);
        }
        catch(Exception e)
        {
            assert(true);
        }

    }

    @Test
    void division() {

        try
        {
            assert(Arrays.equals(liste.division(zahl1, 2), new int[]{4,1,5,0,0}));
        }
        catch(Exception e)
        {
            assert(false);
        }

        try
        {
            assert(Arrays.equals(liste.division(zahl4, 2), new int[]{4, 4, 9, 9}));
        }
        catch(Exception e)
        {
            assert(false);
        }

        try
        {
            liste.division(zahl5, -5);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            liste.division(zahl5, 100);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            liste.division(zahl5, 0);
        }
        catch(Exception e)
        {
            assert(true);
        }
    }
}