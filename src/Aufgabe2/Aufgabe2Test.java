package Aufgabe2;

import Aufgabe1.Aufgabe1;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Aufgabe2Test {

    Aufgabe2 liste = new Aufgabe2();
    int[] zahlen = new int[] {34, 67, 20, 38, 37, 53, 90, 22, 46, 40, 27, 33, 48};//guter Fall
    int[] zahlen2 = new int[] {34, 67, 20, -38, 37};//- Fall
    int[] zahlen3 = new int[] {}; //Leer Fall


    @Test
    void max() {

        try
        {
            assertEquals(90, liste.max(zahlen));
        }
        catch(Exception e)
        {
            assert(false);
        }

        try
        {
            liste.max(zahlen2);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            liste.max(zahlen3);
        }
        catch(Exception e)
        {
            assert(true);
        }
    }

    @Test
    void min() {

        try
        {
            assertEquals(20, liste.min(zahlen));
        }
        catch(Exception e)
        {
            assert(false);
        }

        try
        {
            liste.min(zahlen2);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            liste.min(zahlen3);
        }
        catch(Exception e)
        {
            assert(true);
        }

    }

    @Test
    void summe() {

        try
        {
            assertEquals(555, liste.summe(zahlen));
        }
        catch(Exception e)
        {
            assert(false);
        }

        try
        {
            liste.summe(zahlen2);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            liste.summe(zahlen3);
        }
        catch(Exception e)
        {
            assert(true);
        }
    }

    @Test
    void max_summe() {

        try
        {
            assertEquals(535, liste.max_summe(zahlen));
        }
        catch(Exception e)
        {
            assert(false);
        }

        try
        {
            liste.max_summe(zahlen2);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            liste.max_summe(zahlen3);
        }
        catch(Exception e)
        {
            assert(true);
        }

    }

    @Test
    void min_summe() {

        try
        {
            assertEquals(465, liste.min_summe(zahlen));
        }
        catch(Exception e)
        {
            assert(false);
        }

        try
        {
            liste.min_summe(zahlen2);
        }
        catch(Exception e)
        {
            assert(true);
        }

        try
        {
            liste.min_summe(zahlen3);
        }
        catch(Exception e)
        {
            assert(true);
        }

    }
}