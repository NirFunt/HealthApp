import java.util.ArrayList;
import java.util.List;

public class DummyDB {

    public static void main(String[] args) {

        Meal pastaTomatoSauce = new Meal ("Pasta with Tomattow Sauce",200.0, 30, "100g Pasta with Tomattow Sauce");
        Meal chickenSoup = new Meal ("Chicken Soup",50.5,15, "two bowls of soup");
        Meal saladOil = new Meal ("Salad with oil",15.85,5,"Salad with one spoon of olive oil");

        List<Meal> listOfMeals = new ArrayList<>();
        listOfMeals.add(pastaTomatoSauce);
        listOfMeals.add(chickenSoup);
        listOfMeals.add(saladOil);

    }


}
