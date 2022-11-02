package decoratorresource;

public abstract class CoffeeCup implements CoffeeMachine{

	protected CoffeeMachine cm;

	public CoffeeCup(CoffeeMachine cm){
		this.cm = cm;
		}
	/*public void cupColor(){
		System.out.println("nescafe");
	}*/
	
	public void brew(){
		cm.brew();
	}
}



