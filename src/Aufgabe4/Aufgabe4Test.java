package Aufgabe4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Aufgabe4Test {

    Aufgabe4 liste = new Aufgabe4();

    @Test
    void billige_tastatur() {

        try{
            liste.billige_tastatur(new int[] {});
        }
        catch(Exception e)
        {
            assert(true);
        }

        try{
            liste.billige_tastatur(new int[] {1,13,-13});
        }
        catch(Exception e)
        {
            assert(true);
        }

        try{
            assertEquals(11, liste.billige_tastatur(new int[] {32, 32, 40, 20, 111, 21, 11, 12}));
        }
        catch(Exception e)
        {
            assert(false);
        }
    }

    @Test
    void teuesten() {

        try{
            liste.teuesten(new int[] {}, new int[] {2, 3, 32});
        }
        catch(Exception e)
        {
            assert(true);
        }

        try{
            liste.teuesten(new int[] {1,13,-13}, new int[] {223, 3, 1, 212, 23});
        }
        catch(Exception e)
        {
            assert(true);
        }

        try{
            assertEquals(123, liste.teuesten(new int[] {32, 32, 40, 20, 111, 21, 11, 12}, new int[] {34, 123, 32, 3}));
        }
        catch(Exception e)
        {
            assert(false);
        }
    }

    @Test
    void buget_USB() {

        try{
            liste.buget_USB(3, new int[] {});
        }
        catch(Exception e)
        {
            assert(true);
        }

        try{
            liste.buget_USB(-4, new int[] {1,13,3,60});
        }
        catch(Exception e)
        {
            assert(true);
        }

        try{
            liste.buget_USB(0, new int[] {1,133,66,113,33});
        }
        catch(Exception e)
        {
            assert(true);
        }

        try{
            liste.buget_USB(4, new int[] {1,13,-13});
        }
        catch(Exception e)
        {
            assert(true);
        }

        try{
            assertEquals(59, liste.buget_USB(60, new int[] {32, 32, 40, 20, 111, 21, 11, 12, 59}));
        }
        catch(Exception e)
        {
            assert(false);
        }

        try{
            assertEquals(21, liste.buget_USB(31, new int[] {32, 32, 40, 20, 111, 21, 11, 12, 59}));
        }
        catch(Exception e)
        {
            assert(false);
        }
    }

    @Test
    void buget_preisliste() {

        try{
            liste.buget_preisliste(30, new int[] {}, new int[] {});
        }
        catch(Exception e)
        {
            assert(true);
        }

        try{
            liste.buget_preisliste(-4, new int[] {1,13,3,60}, new int[] {3});
        }
        catch(Exception e)
        {
            assert(true);
        }

        try{
            liste.buget_preisliste(0, new int[] {1,133,66,113,33}, new int[] {});
        }
        catch(Exception e)
        {
            assert(true);
        }

        try{
            liste.buget_preisliste(4, new int[] {1,13,-13}, new int[] {3,6,11});
        }
        catch(Exception e)
        {
            assert(true);
        }

        try{
            assertEquals(55, liste.buget_preisliste(60, new int[] {32,37,40,20,111}, new int[] {12,15,49,3}));
        }
        catch(Exception e)
        {
            assert(false);
        }

        try{
            assertEquals(-1, liste.buget_preisliste(31, new int[] {32,32,40,20,111,21,11,12,59}, new int[] {30,21,23,90,22}));
        }
        catch(Exception e)
        {
            assert(false);
        }


    }
}