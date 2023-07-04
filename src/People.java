
import java.util.ArrayList;
import java.util.Scanner;

public abstract class People {

	protected ArrayList<Address> arrParti = new ArrayList<>();
	protected ArrayList<ShoppingCart> arrShop = new ArrayList<>();

	protected String nameSurname;
	protected int birthday;
	protected double accountBalance;
	protected double orderPrice;
	protected int id;

	public People(int id, String nameSurname, int birthday, double accountBalance) {
		this.id = id;
		this.nameSurname = nameSurname;
		this.birthday = birthday;
		this.accountBalance = accountBalance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}


	@Override
	public String toString() {
		String a="";
        for(Address address :this.arrParti)
            a+=address.toString()+"\n";
		
		
		return ("Id= " + this.id + "\nName and Surname= " + this.nameSurname + "\nBirthday= " + this.birthday+ "\nCountry and city: "+a
				+ "\nAccount balance= " + this.accountBalance + "Order Price: " + this.orderPrice);
	}

	public abstract double calculatePrice(double price);

}
