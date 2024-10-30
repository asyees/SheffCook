package com.salad;

import com.salad.model.Salad;
import com.salad.model.Vegetable;
import com.salad.service.SaladService;

public class SaladApp {
    public static void main(String[] args) {
        Salad salad = new Salad();
        salad.addVegetable(new Vegetable("Tomato", 18));
        salad.addVegetable(new Vegetable("Cucumber", 16));
        salad.addVegetable(new Vegetable("Carrot", 41));

        SaladService service = new SaladService();

        System.out.println("Total calories: " + salad.getTotalCalories());
        System.out.println("Sorted vegetables: " + service.sortVegetablesByCalories(salad));
        System.out.println("Vegetables in calorie range (15-30): " + service.findVegetablesInCalorieRange(salad, 15, 30));
    }
}
