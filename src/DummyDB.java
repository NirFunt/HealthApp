import java.util.ArrayList;
import java.util.List;

public class DummyDB {

    public static void main(String[] args) {

        Meal pastaTomatoSauce = new Meal ("Pasta with Tomattow Sauce",200.0, 30);
        Meal chickenSoup = new Meal ("Chicken Soup",50.5,15);

        List<Meal> listOfMeals = new ArrayList<>();
        listOfMeals.add(pastaTomatoSauce);
        listOfMeals.add(chickenSoup);

    }


}
