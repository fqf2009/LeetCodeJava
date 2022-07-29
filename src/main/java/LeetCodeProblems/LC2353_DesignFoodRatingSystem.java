package LeetCodeProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.AbstractMap.SimpleEntry;

public class LC2353_DesignFoodRatingSystem {
    Map<String, Integer> foodRating;
    Map<String, String> foodCuisine;
    Map<String, TreeSet<SimpleEntry<String, Integer>>> cuisineFoods;

    public LC2353_DesignFoodRatingSystem(String[] foods, String[] cuisines, int[] ratings) {
        foodRating = new HashMap<>();
        foodCuisine = new HashMap<>();
        cuisineFoods = new HashMap<>();
        for (int i = 0; i < foods.length; i++) {
            foodRating.put(foods[i], ratings[i]);
            foodCuisine.put(foods[i], cuisines[i]);
            TreeSet<SimpleEntry<String, Integer>> cuiFoods;
            if (cuisineFoods.containsKey(cuisines[i])) {
                cuiFoods = cuisineFoods.get(cuisines[i]);
            } else {
                cuiFoods = new TreeSet<>((a, b) -> a.getValue().equals(b.getValue()) ?
                        b.getKey().compareTo(a.getKey()) : a.getValue().compareTo(b.getValue()));
                cuisineFoods.put(cuisines[i], cuiFoods);
            }
            cuiFoods.add(new SimpleEntry<>(foods[i], ratings[i]));
        }
    }

    public void changeRating(String food, int newRating) {
        int oldRating = foodRating.get(food);
        foodRating.put(food, newRating);
        TreeSet<SimpleEntry<String, Integer>> cuiFoods = cuisineFoods.get(foodCuisine.get(food));
        cuiFoods.remove(new SimpleEntry<>(food, oldRating));
        cuiFoods.add(new SimpleEntry<>(food, newRating));
    }

    public String highestRated(String cuisine) {
        TreeSet<SimpleEntry<String, Integer>> cuiFoods = cuisineFoods.get(cuisine);
        return cuiFoods.last().getKey();
    }
}

class LC2353_DesignFoodRatingSystem1 {
    Map<String, SimpleEntry<String, Integer>> foodRating;
    Map<String, TreeSet<SimpleEntry<String, Integer>>> cuisineFoods;

    public LC2353_DesignFoodRatingSystem1(String[] foods, String[] cuisines, int[] ratings) {
        foodRating = new HashMap<>();
        cuisineFoods = new HashMap<>();
        for (int i = 0; i < foods.length; i++) {
            foodRating.put(foods[i], new SimpleEntry<>(cuisines[i], ratings[i]));
            TreeSet<SimpleEntry<String, Integer>> cuiFoods;
            if (cuisineFoods.containsKey(cuisines[i])) {
                cuiFoods = cuisineFoods.get(cuisines[i]);
            } else {
                cuiFoods = new TreeSet<>((a, b) -> a.getValue().equals(b.getValue()) ?
                        b.getKey().compareTo(a.getKey()) : a.getValue().compareTo(b.getValue()));
                cuisineFoods.put(cuisines[i], cuiFoods);
            }
            cuiFoods.add(new SimpleEntry<>(foods[i], ratings[i]));
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foodRating.get(food).getKey();
        Integer oldRating = foodRating.get(food).getValue();
        foodRating.put(food, new SimpleEntry<>(cuisine, newRating));
        TreeSet<SimpleEntry<String, Integer>> cuiFoods = cuisineFoods.get(cuisine);
        cuiFoods.remove(new SimpleEntry<>(food, oldRating));
        cuiFoods.add(new SimpleEntry<>(food, newRating));
    }

    public String highestRated(String cuisine) {
        TreeSet<SimpleEntry<String, Integer>> cuiFoods = cuisineFoods.get(cuisine);
        return cuiFoods.last().getKey();
    }
}