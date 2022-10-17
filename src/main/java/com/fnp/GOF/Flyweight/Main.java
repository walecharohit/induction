import flyweightresource.*;

public class Main{
	//private static String coffee[] = {"light","strong"};
	public static void main(String [] args){
	
	Coffee coffee = (Coffee)CoffeeMachine.getCoffee("strong");
	coffee.setMilk("true");
	coffee.brew();
	} 
}
