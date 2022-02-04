package day1;

public class Order {
	private int orderId;
	private Food[] orderedFoods;
	private double totalPrice;
	private String status;
	
	public Order(int orderId,Food[] orderedFoods,double totalPrice,String status) {
		this.orderId=orderId;
		this.orderedFoods=orderedFoods;
		this.totalPrice=totalPrice;
		this.status=status;
		
	}
	
	
	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public Food[] getOrderedFoods() {
		return orderedFoods;
	}


	public void setorderedFoods(Food[] orderedFoods) {
		this.orderedFoods = orderedFoods;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	
	public double calculateTotalPrice(String paymentType) {         
		double totalPrice=0.0;         
		double tax=0.0; 
		
		if(paymentType.contentEquals("Debit card"))            
			tax=5;         
		else if(paymentType.contentEquals("Credit card"))             
			tax=8;
		for(Food f:this.getOrderedFoods()) {
        totalPrice=totalPrice+f.getUnitPrice()+(f.getUnitPrice()*tax/100.0);
    }
		
    this.setTotalPrice(totalPrice);
    return totalPrice;
}

}
