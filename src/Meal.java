public class Meal {

    private String name;
    private double calories;
    private int score;
    private String description;

    public Meal(String name, double calories, int score, String description) {
        this.name = name;
        this.calories = calories;
        this.score = score;
        this.description = description;
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

    public String getDescription () {
        return description;
    }

    @Override
    public String toString() {
       return name + "," + calories + "," + score + "," + description;
    }
}
