public class Meal {

    private String name;
    private double calories;
    private int score;

    public Meal(String name, double calories, int score, String description) {
        this.name = name;
        this.calories = calories;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public int getScore() {
        return score;
    }
}
