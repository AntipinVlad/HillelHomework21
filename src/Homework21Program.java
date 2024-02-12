import Helpers.DrinksMachine;
import Modules.Drinks;

import java.util.Scanner;

import static Helpers.DrinksMachine.*;
import static Modules.Drinks.*;

public class Homework21Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Select a drink by writing a number from 0 to 5: \n"
                            + "0 %s: %,.2f \n"
                            + "1 %s: %,.2f \n"
                            + "2 %s: %,.2f \n"
                            + "3 %s: %,.2f \n"
                            + "4 %s: %,.2f \n"
                            + "5 %s: %,.2f \n"
                            + "6 Exit \n",
                    COFFEE, COFFEE_PRICE, TEA, TEA_PRICE, LEMONADE, LEMONADE_PRICE, MOJITO, MOCHITO_PRICE, MINERAL_WATER, MINERAL_WATER_PRICE, COCA_COLA, COCA_COLA_PRICE);

            String choice = scanner.nextLine();
            DrinksMachine drink;

            switch (choice) {
                case "0":
                    drink = COFFEE;
                    break;
                case "1":
                    drink = DrinksMachine.TEA;
                    break;
                case "2":
                    drink = DrinksMachine.LEMONADE;
                    break;
                case "3":
                    drink = DrinksMachine.MOJITO;
                    break;
                case "4":
                    drink = DrinksMachine.MINERAL_WATER;
                    break;
                case "5":
                    drink = DrinksMachine.COCA_COLA;
                    break;
                case "6":
                    Drinks.displayTotal();
                    scanner.close();
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
