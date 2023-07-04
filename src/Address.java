import java.util.Scanner;

public class Address {

	private String country;
	private String city;

	public Address() {

	}

	public void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter country: ");
		country = sc.nextLine();
		System.out.print("Enter city: ");
		city = sc.nextLine();
	}

	@Override
	public String toString() {
		return "Country= " + country + "\nCity= " + city;
	}

}
