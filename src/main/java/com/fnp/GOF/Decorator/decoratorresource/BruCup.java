package decoratorresource;

public class BruCup extends CoffeeCup{
	
	public BruCup(CoffeeMachine cm){
		super(cm);
	}
	
	public void brew(){
		cm.brew();
		System.out.println("BruCup");
	}
}
