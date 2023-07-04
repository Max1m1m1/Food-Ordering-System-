import java.util.ArrayList;
import java.util.Scanner;

public class PeopleSys {

	private static ArrayList<People> arr = new ArrayList<People>();

	public static boolean checkId(int number) {

		for (People p : arr)
			if (p.id == number)
				return true;

		return false;
	}

	public static boolean add(int id, String nameSurname, int birthday, String country, String city,
			double accountBalance, boolean dywh) {

		Customer c;
		Worker w;
		ShoppingCart s;

		if (checkId(id)) {
			return false;
		}

		else {
			if (dywh) {
				w = new Worker(id, nameSurname, birthday, accountBalance);
				arr.add(w);
				return true;
			}

			else if (!dywh) {
				c = new Customer(id, nameSurname, birthday, accountBalance);

				arr.add(c);
				return true;
			}
			return false;
		}
	}

	public static String displayAll() {
		String output = "";
		for (People p : arr)
			if (p instanceof Customer)
				output += "Customer\n" + p.toString() + "\n";
			else if (p instanceof Worker) {
				output += "Worker\n" + p.toString() + "\n";

			}
		return output;
	}

	public static String search(int id) {
		String output = "";
		for (People p : arr) {
			if (id == p.getId() && p instanceof Customer)
				output = ("Customer\n----------\n" + p.toString());
			else if ((id == p.getId() && p instanceof Worker))
				output += ("Worker\n----------\n" + p.toString());
		}

		return output;

	}

	public static String delete(int id) {
		int i = 0;
		for (People p : arr) {
			if (id == p.getId()) {
				arr.remove(i);
				return "People with " + id + "(id) has deleted.";
			}
			i++;
		}
		return "No people with this id" + (id) + "found";
	}

	public static String addOrder(int id, String foodType, int cntfood, String drinkType, int cntdrink) {
		String output = "";
		for (People p : arr) {
			if (id == p.getId()) {
				ShoppingCart s = new ShoppingCart(foodType, drinkType, cntfood, cntdrink);
				output += "Your order is:\n"+cntfood+" "+foodType;
				output += "Your order is:\n"+cntdrink+" "+drinkType;
				if (p.calculatePrice(s.getPrice()) < p.accountBalance) {
					p.setOrderPrice(p.calculatePrice(s.getPrice()));
					output += ("After your discount your total is: " + p.orderPrice);
					output += ("\nYou have successfully ordered");
				} else
					output += ("\nYou don't have enough money to order.");
			}

		}
		return output;
	}

}
