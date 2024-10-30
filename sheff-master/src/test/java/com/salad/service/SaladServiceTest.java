package com.salad.service;

import com.salad.model.Salad;
import com.salad.model.Vegetable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SaladServiceTest {
    private Salad salad;
    private SaladService saladService;

    @BeforeEach
    void setUp() {
        salad = new Salad();
        saladService = new SaladService();
        salad.addVegetable(new Vegetable("Tomato", 18));
        salad.addVegetable(new Vegetable("Cucumber", 16));
        salad.addVegetable(new Vegetable("Carrot", 41));
    }

    @Test
    void testSortVegetablesByCalories() {
        List<Vegetable> sortedVegetables = saladService.sortVegetablesByCalories(salad);
        assertEquals("Cucumber", sortedVegetables.get(0).getName());
        assertEquals("Tomato", sortedVegetables.get(1).getName());
        assertEquals("Carrot", sortedVegetables.get(2).getName());
    }

    @Test
    void testFindVegetablesInCalorieRange() {
        List<Vegetable> vegetablesInRange = saladService.findVegetablesInCalorieRange(salad, 15, 30);
        assertEquals(2, vegetablesInRange.size());
        assertTrue(vegetablesInRange.stream().anyMatch(v -> v.getName().equals("Cucumber")));
        assertTrue(vegetablesInRange.stream().anyMatch(v -> v.getName().equals("Tomato")));
    }
}
