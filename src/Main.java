import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/* Mikey Cash, CSCI-1660, 2/6/25 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        System.out.println("Please type the city you would like to enter");
        capitalCities.put(input.nextLine(), input.nextLine());
        capitalCities.put(input.nextLine(), input.nextLine());
        capitalCities.put(input.nextLine(), input.nextLine());
        capitalCities.put(input.nextLine(), input.nextLine());
        System.out.println(capitalCities);
        System.out.println("Please type the city you would like to enter");
        String userInput = input.nextLine();
        String STOP = "END";

        while(!userInput.equals(STOP)){

            System.out.println("Please enter another city, when finished type END");
            input.nextLine();
            if (userInput.equals(STOP)) {
                break;
            }
        }
    }

}