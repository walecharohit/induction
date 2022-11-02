import templateresource.*;

class Main{
	public static void main(String [] args){
		CoffeeMachine coffeemachine = new Cappuchino();
		coffeemachine.begin();
		
		coffeemachine = new Latte();
		coffeemachine.begin();
	}
}
