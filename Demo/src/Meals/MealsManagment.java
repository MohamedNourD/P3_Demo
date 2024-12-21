package Meals;

import Users.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MealsManagment {
    public static void addMeal(Meal meal) throws IOException {
        try (FileWriter writer = new FileWriter("users.csv", true)) {
            writer.write(meal.toString() + "\n");
        }
    }
    public static void editMeal(String mealName, Meal updatedMeal) throws IOException {
        List<Meal> meals = getMeals();
        try (FileWriter writer = new FileWriter("meals.csv")) {
            for (Meal meal : meals) {
                if (meal.getName().equals(mealName)) {
                    writer.write(updatedMeal.toString() + "\n");
                } else {
                    writer.write(meal.toString() + "\n");
                }
            }
        }
    }
    public static void deleteMeal(String mealName) throws IOException {
        List<Meal> meals = getMeals();
        try (FileWriter writer = new FileWriter("meals.csv")) {
            for (Meal meal : meals) {
                if (!meal.getName().equals(mealName)) {
                    writer.write(meal.toString() + "\n");
                }
            }
        }
    }
    public static List<Meal> getMeals() throws IOException {
        List<Meal> meals = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("meals.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                meals.add(Meal.fromCSV(line));
            }
        }
        return meals;
    }

}
