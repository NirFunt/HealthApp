import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    static List<Meal> mealList = new ArrayList<>();
    public static void main(String[] args) {


        try (ServerSocket serverSocket = new ServerSocket(3022)) {
            Socket socket = serverSocket.accept();
            System.out.println("New Host Connected");
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(),true);

            while (true) {
                String theInput = input.readLine();
                if (theInput.equals("Start Sending Meals")) {
                    constructMeals (input,output);
                }
                if (theInput.equals("Exit")) {
                    for (Meal meal : mealList) {
                        System.out.println(meal.toString());
                    }
                    break;
                }
            }


        } catch (IOException e) {
            System.out.println("could not open ServerSocket " + e.getMessage());
        }


    }

    public static void constructMeals (BufferedReader input, PrintWriter output) throws IOException {
        while (true) {
            String theInput = input.readLine();
            if (theInput.equals("Finish")) {
                break;
            }
            String [] mealsStringArray = theInput.split(",");
            Meal meal = new Meal(mealsStringArray[0],Integer.parseInt(mealsStringArray[1]),Integer.parseInt(mealsStringArray[2]),mealsStringArray[3]);
            mealList.add(meal);
        }

    }

}
