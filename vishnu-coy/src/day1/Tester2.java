package day1;

public class Tester2 {
	

	public static void main(String[] args) {
		Food food1=new Food();
        food1.setFoodName("Noodles");
        food1.setCuisine("Chinese");
        food1.setFoodType("Veg");
        food1.setQuantityAvailable(10);
        food1.setUnitPrice(50.0);
        
        
        Food food2=new Food();
        food2.setFoodName("Fried rice");
        food2.setCuisine("Chinese");
        food2.setFoodType("Veg");
        food2.setQuantityAvailable(20);
        food2.setUnitPrice(55.0);
        
        Food food3=new Food();
        food3.setFoodName("Soup");
        food3.setCuisine("Continental");
        food3.setFoodType("Veg");
        food3.setQuantityAvailable(11);
        food3.setUnitPrice(10.0);
        
        
        Food[] foodItems=new Food[] {food1,food2,food3};        
        Order Order1 = new Order(101,foodItems, 0, null);
        Bill b = new Bill();
        b.generateBill(Order1);
    }

	}
