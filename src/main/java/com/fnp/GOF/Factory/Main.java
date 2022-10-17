import factoryresource.*;

class Main{
	
	public static void main(String [] args){
	
		Kitchen kitchen = new Kitchen();
		Food pizza = kitchen.getFood("Pizza");
		pizza.cook();
		
		Food burger = kitchen.getFood("Burger");
		burger.cook();
	}
}
