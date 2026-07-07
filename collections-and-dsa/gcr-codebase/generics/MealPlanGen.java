interface MealPlan {
    String getMeal();
}

class VegetarianMeal implements MealPlan {
    public String getMeal() {
        return "Vegetarian Meal";
    }
}

class VeganMeal implements MealPlan {
    public String getMeal() {
        return "Vegan Meal";
    }
}

class KetoMeal implements MealPlan {
    public String getMeal() {
        return "Keto Meal";
    }
}

class HighProteinMeal implements MealPlan {
    public String getMeal() {
        return "High Protein Meal";
    }
}

class Meal<T extends MealPlan> {
    T plan;

    Meal(T plan) {
        this.plan = plan;
    }

    void display() {
        System.out.println(plan.getMeal());
    }
}

public class MealPlanGen {

    static <T extends MealPlan> void generateMeal(T plan) {
        System.out.println("Generated Meal Plan: " + plan.getMeal());
    }

    public static void main(String[] args) {

        Meal<VegetarianMeal> m1 = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> m2 = new Meal<>(new VeganMeal());
        Meal<KetoMeal> m3 = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> m4 = new Meal<>(new HighProteinMeal());

        m1.display();
        m2.display();
        m3.display();
        m4.display();

        generateMeal(new VegetarianMeal());
        generateMeal(new KetoMeal());
    }
}