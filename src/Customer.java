
public class Customer extends People {




	public Customer(int id, String nameSurname, int birthday, double accountBalance) {
		super(id, nameSurname, birthday, accountBalance);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		super.toString();
		return ("Id= " + this.id + "\nName and Surname= " + this.nameSurname + "\nBirthday= " + this.birthday
				+ "\nAccount balance= " + (this.accountBalance - this.orderPrice) + "\nOrder Price: "
				+ this.orderPrice);
	}

	@Override
	public double calculatePrice(double price) {

		if (birthday >= 10 && birthday <= 15)
			price *= .9;

		return price;

	}

}
