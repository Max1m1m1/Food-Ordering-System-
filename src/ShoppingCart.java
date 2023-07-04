import java.util.Scanner;

public class ShoppingCart {

	private static String foodType, drinkType;
	private static int cntfood, cntDrink;
	private static double price;

	private static final double pizzaPrice = 40;
	private static final double burgerPrice = 35;
	private static final double cokePrice = 10;
	private static final double ayranPrice = 8;

	public ShoppingCart(String foodType, String drinkType, int cntfood, int cntDrink) {
		this.foodType = foodType;
		this.drinkType = drinkType;
		this.cntfood = cntfood;
		this.cntDrink = cntDrink;

		if (foodType.equalsIgnoreCase("pizza")) {
			price += pizzaPrice * cntfood;
			if (drinkType.equalsIgnoreCase("ayran"))
				price += ayranPrice * cntDrink;
			else if (drinkType.equalsIgnoreCase("coke"))
				price += cokePrice * cntDrink;
		} else if (foodType.equalsIgnoreCase("burger")) {
			price += burgerPrice * cntfood;
			if (drinkType.equalsIgnoreCase("ayran"))
				price += ayranPrice * cntDrink;
			else if (drinkType.equalsIgnoreCase("coke"))
				price += cokePrice * cntDrink;
		}

	}

	public static double getPrice() {
		return price;
	}

	public static String getFoodType() {
		return foodType;
	}

	public static String getDrinkType() {
		return drinkType;
	}

	public static int getCntfood() {
		return cntfood;
	}

	public static int getCntDrink() {
		return cntDrink;
	}

}