import coffeebeans.*;

class Main{
	
	public static void main(String [] args){
		Coffee cup = new CappuchinoConsumer();
		CoffeeMachine cappuchino = new Cappuchino(cup);
		cappuchino.brewIt();
		System.out.println(cup);

		Coffee mycup = new LatteConsumer();
		CoffeeMachine latte = new Latte(mycup);
		latte.brewIt();
		System.out.println(mycup);
		System.out.println(latte);
	}
}
