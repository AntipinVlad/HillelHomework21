import Helpers.DrinksMachine;
import Modules.Drinks;

import java.util.Arrays;
import java.util.Scanner;

public class Homework21Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Select a drink by writing a number from 0 to 5: %s \nFor Exit write 6 \n",
                    Arrays.toString(DrinksMachine.values()));

            int choice = scanner.nextInt();
            DrinksMachine drink;

            switch (choice) {
                case 0:
                    drink = DrinksMachine.COFFEE;
                    break;
                case 1:
                    drink = DrinksMachine.TEA;
                    break;
                case 2:
                    drink = DrinksMachine.LEMONADE;
                    break;
                case 3:
                    drink = DrinksMachine.MOJITO;
                    break;
                case 4:
                    drink = DrinksMachine.MINERAL_WATER;
                    break;
                case 5:
                    drink = DrinksMachine.COCA_COLA;
                    break;
                case 6:
                    Drinks.displayTotal();
                    return;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }
            Drinks.makeDrink(drink);
            Drinks.calculateTotalAmount(drink);
        }
    }
}
