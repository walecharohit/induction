package coffeebeans;
 
public class Latte extends CoffeeMachine{

	public Latte(Coffee coffee){
		super(coffee);
	}

	public void brewIt(){
		coffee.makeCoffee();
	}
}
