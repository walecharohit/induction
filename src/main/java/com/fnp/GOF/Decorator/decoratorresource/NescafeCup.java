package decoratorresource;

public class NescafeCup extends CoffeeCup{

	
	public NescafeCup(CoffeeMachine cm){
		super(cm);
	}
	
	public void brew(){
		cm.brew();
		System.out.println("Nescafe");
	}

}
