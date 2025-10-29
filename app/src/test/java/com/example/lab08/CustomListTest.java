
package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    // this tests both has city and add city
    @Test
    public void testAddHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDelCity() {
        CustomList list = new CustomList();
        City edm = new City("Edmonton", "AB");
        City cal = new City("Calgary", "AB");

        list.addCity(edm);
        list.addCity(cal);

        list.delCity(cal);

        assertTrue(list.hasCity(edm));
        assertFalse(list.hasCity(cal));
    }




}