package day3;
class CustomerSwiftFood {
	private String customerId;
    private String customerName;
    private long contactNumber;
    private Address address;
    
    public CustomerSwiftFood(String customerId,String customerName,long contactNumber,Address address)
    {
    	this.customerId=customerId;
    	this.customerName=customerName;
    	this.contactNumber=contactNumber;
    	this.address=address;
    }
    
    public void updateDetails(long contactNumber) {
    	System.out.println("Current phone number:"+this.getContactNumber());
    	this.setContactNumber(contactNumber);
    	System.out.println("Phone number updated to:" +this.getContactNumber());
    }
    
    public void updateDetails(Address address) {
    	this.setAddress(address);
    	System.out.println("address updated");
    }
    
    public void updateDetails(long phone, Address address) {
    	this.setAddress(address);
    	this.setContactNumber(contactNumber);
    	System.out.println("phone number and address updated");
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
class Address{
    private int doorNo;
    private String streetName;
    private String area;
    public Address(int doorNo,String streetName, String area) {
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

public class Tester1 {

	public static void main(String[] args) {
		Address add1=new Address(12,"Grand street","Gulmohar avenue");                 
		CustomerSwiftFood cust=new CustomerSwiftFood("C101","Mary",9987654321L,add1);         
		//cust.updateDetails(8877123450L);         
		//cust.updateDetails(new Address(22,"New Street","New Area"));         
		cust.updateDetails(8877123450L,new Address(22,"New Street","New Area")); 

	}

}
