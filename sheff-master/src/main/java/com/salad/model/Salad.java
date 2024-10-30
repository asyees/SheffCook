package com.salad.model;

import java.util.ArrayList;
import java.util.List;

public class Salad {
    private List<Vegetable> vegetables = new ArrayList<>();

    public void addVegetable(Vegetable vegetable) {
        vegetables.add(vegetable);
    }

    public int getTotalCalories() {
        return vegetables.stream().mapToInt(Vegetable::getCalories).sum();
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }
}
