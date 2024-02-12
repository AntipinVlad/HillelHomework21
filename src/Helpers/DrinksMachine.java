package Helpers;

public enum DrinksMachine {
    COFFEE("COFFEE"),
    TEA("TEA"),
    LEMONADE("LEMONADE"),
    MOJITO("MOJITO"),
    MINERAL_WATER("MINERAL_WATER"),
    COCA_COLA("COCA_COLA");

    private String drinkName;

    DrinksMachine(String name) {
        this.drinkName = name;
    }

    public String getDrinkName() {
        return drinkName;
    }
}
