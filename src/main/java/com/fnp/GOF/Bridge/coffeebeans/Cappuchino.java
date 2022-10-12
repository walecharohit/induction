package coffeebeans;

public class Cappuchino extends CoffeeMachine{
	
	public Cappuchino(Coffee coffee){
		super(coffee);
	}
	
	public void brewIt(){
		coffee.makeCoffee();
	}
}
