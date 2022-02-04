package day1;

public class Bill {
	private static int Counter;
	private int BillId;
	private String paymentMode;
	static {
		Bill.Counter=500;
	}
	
	
	public static int getCounter() {
		return Counter;
	}


	public static void setCounter(int counter) {
		Counter = counter;
	}


	public int getBillId() {
		return BillId;
	}


	public void setBillId(int billId) {
		BillId = billId;
	}


	public String getPaymentMode() {
		return paymentMode;
	}


	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}


	public boolean generateBill(Order order) {
		System.out.println("Bill Id:"+this.getBillId());
		System.out.println("Food items ordered:");
		
		for(Food f:order.getOrderedFoods()) {
			System.out.println(f.getFoodName());
		}
		System.out.println("Total price:"+order.calculateTotalPrice(this.getPaymentMode()));
		return true;
		
	}
}
