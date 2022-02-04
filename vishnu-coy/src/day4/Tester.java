package day4;
class Customer {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private Address address;    
	public Customer(String customerId, String customerName, long contactNumber,Address address) {         
		this.customerId = customerId;         
		this.customerName = customerName;        
		this.contactNumber = contactNumber;         
		this.address = address;    
	}
	public double payBill(double totalPrice) {         
		System.out.println("Total bill amount for customer calculated here");         
		return totalPrice;    
	} 
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	} 
	
}

class Address {
	private int doorNo;
	private String streetName;
	private String area;
	public Address(int doorNo,String streetName,String area) {         
		this.doorNo=doorNo;         
		this.streetName=streetName;         
		this.area=area;    
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	} 
	
}


class RegularCustomer extends Customer {
	private float discount;

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public RegularCustomer(String customerId,String customerName,long contactNumber,Address address) {
		super(customerId,customerName,contactNumber,address);
		this.discount=5.0f;
	}
	@Override
	public double payBill(double totalPrice) {
		System.out.println("Total bill amount for a regular customer calculated here");
		return(totalPrice-(totalPrice*(this.getDiscount()/100)));
	}
	
}
public class Tester {    
    public static void main(String[] args) {
        Address add1=new Address(34,"Grand street","Gladioli grove");
        //parent class object and parent class reference
        Customer cust1=new Customer("C101","Peter",8765443219L,add1);
        System.out.println("Bill amount: "+cust1.payBill(1000));
        
        //child class object and child class reference
        RegularCustomer rc=new RegularCustomer("C102","Simon",9976543210L,add1);
        System.out.println("Bill amount: "+rc.payBill(1000));
        
        //parent class and child class object
        Customer cust3=new RegularCustomer("C103","Mark",6754321980L,add1);
        System.out.println("Bill amount: "+cust3.payBill(1000));
        
    }
}

