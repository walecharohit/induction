import decoratorresource.*;

class Main{

	public static void main(String [] args){
	
		CoffeeMachine cappuchino = new Cappuchino();
		CoffeeMachine nescafe = new NescafeCup(new Cappuchino());
		System.out.println("Cappuchino is made.");
		cappuchino.brew();
		System.out.println("Cappuchino inside a nescafe branded cup.");
		nescafe.brew();
		
		
		CoffeeMachine latte = new Latte();
		CoffeeMachine bru = new BruCup(latte);
		System.out.println("Latte is made.");
		latte.brew();
		System.out.println("Latte inside a Bru cup.");
		bru.brew();
	}
}
