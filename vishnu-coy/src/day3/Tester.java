package day3;
class Customer {
	private int custId;
	private String custName;
	public void displayDetails() {
		System.out.println("CustId:" +this.custId);
		System.out.println("Customer name:" +this.custName);
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public Customer() {
		System.out.println("Inside customer class");
		
	}
	public Customer(int custId) {
		this.custId=custId;
		System.out.println("Inside constructor with 1 argument");
	}
	public Customer(int custId, String custName) {
		this.custId=custId;
		this.custName=custName;
		System.out.println("Inside constructor 2");
	}
}

class RegularCustomer extends Customer {
	public RegularCustomer() {
		System.out.println("Inside Regular Customer Class");
	}
	public void display() {
		this.setCustId(100);
		this.setCustName("Vishnu");
		//System.out.println("CustId:" +this.getCustId());
		//System.out.println("Customer name:" +this.getCustName());
		this.displayDetails();
	}
}

class Guest extends Customer {
	public Guest() {
		System.out.println("Inside Guest Class");
	}
}

public class Tester {

	public static void main(String[] args) {
		
		RegularCustomer rc= new RegularCustomer();
		rc.display();

	}
}
