package com.salad.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VegetableTest {
    @Test
    void testVegetableCreation() {
        Vegetable vegetable = new Vegetable("Spinach", 23);
        assertEquals("Spinach", vegetable.getName());
        assertEquals(23, vegetable.getCalories());
    }
}
