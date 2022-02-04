package day1;

class Employee {
	private int empID;
	private String empName;
	private long contact;
	private String address;
	
	public Employee(int empID,String empName,long contact,String address) {
		this.empID=empID;
		this.empName=empName;
		this.contact=contact;
		this.address=address;
	}
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

class Department {
	private int deptId;
	private String deptName;
	private Employee manager;
	
    public Department(int deptId,String deptName,Employee manager) {
    	this.deptId=deptId;
    	this.deptName=deptName;
    	this.manager=manager;
    }
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	
	
}
public class Tester {

	public static void main(String[] args) {
		Employee e1=new Employee(413,"Vishnu",9876543210L,"2 Park street");
        Department d1=new Department(9876,"HR",e1); 
        
		System.out.println(e1.getEmpName()+" "+e1.getContact());
		System.out.println(d1.getManager().getEmpName());
		

	}

}
