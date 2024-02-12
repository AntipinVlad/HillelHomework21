package Modules;

import Helpers.DrinksMachine;


public class Drinks {
    public static final double COFFEE_PRICE = 35.0;
    public static final double TEA_PRICE = 15.5;
    public static final double LEMONADE_PRICE = 25.5;
    public static final double MOCHITO_PRICE = 30.0;
    public static final double MINERAL_WATER_PRICE = 18.0;
    public static final double COCA_COLA_PRICE = 35.0;
    private static double totalAmount = 0.0;
    private static int totalDrinks = 0;

    public static void makeDrink(DrinksMachine drink) {
        switch (drink) {
            case COFFEE:
                System.out.println("Making coffee...");
                break;
            case TEA:
                System.out.println("Making tea...");
                break;
            case LEMONADE:
                System.out.println("Making lemonade...");
                break;
            case MOJITO:
                System.out.println("Making mochito...");
                break;
            case MINERAL_WATER:
                System.out.println("Making mineral water...");
                break;
            case COCA_COLA:
                System.out.println("Making Coca Cola...");
                break;
            default:
                System.out.println("Invalid drink choice.");
        }
        totalDrinks++;
    }

    public static void calculateTotalAmount(DrinksMachine drink) {
        switch (drink) {
            case COFFEE:
                totalAmount += COFFEE_PRICE;
                break;
            case TEA:
                totalAmount += TEA_PRICE;
                break;
            case LEMONADE:
                totalAmount += LEMONADE_PRICE;
                break;
            case MOJITO:
                totalAmount += MOCHITO_PRICE;
                break;
            case MINERAL_WATER:
                totalAmount += MINERAL_WATER_PRICE;
                break;
            case COCA_COLA:
                totalAmount += COCA_COLA_PRICE;
                break;
        }
    }

    public static void displayTotal() {
        System.out.println("------------------------------------------------");
        System.out.printf("Total drinks: %d \nTotal amount: %,.2f", totalDrinks, totalAmount);
    }
}