package com.salad.service;

import com.salad.model.Salad;
import com.salad.model.Vegetable;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SaladService {
    public List<Vegetable> sortVegetablesByCalories(Salad salad) {
        return salad.getVegetables().stream()
                .sorted(Comparator.comparingInt(Vegetable::getCalories))
                .collect(Collectors.toList());
    }

    public List<Vegetable> findVegetablesInCalorieRange(Salad salad, int minCalories, int maxCalories) {
        return salad.getVegetables().stream()
                .filter(v -> v.getCalories() >= minCalories && v.getCalories() <= maxCalories)
                .collect(Collectors.toList());
    }
}
