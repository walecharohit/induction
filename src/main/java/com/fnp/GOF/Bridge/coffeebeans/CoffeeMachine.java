package coffeebeans;

public abstract class CoffeeMachine{
	
	Coffee coffee;
	
	public CoffeeMachine(Coffee coffee){
		this.coffee = coffee;
	}
	
	abstract public void brewIt();
}
