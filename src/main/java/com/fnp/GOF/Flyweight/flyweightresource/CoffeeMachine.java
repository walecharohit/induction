package flyweightresource;

import java.util.HashMap;

public class CoffeeMachine{
	private static HashMap newMap = new HashMap(); 
	
	public static Coffee getCoffee(String type){
	
		Coffee coffee = (Coffee)newMap.get(type);
		
		if(coffee == null){
			coffee = new Cappuchino(type);
			newMap.put(type,coffee);
		}
		return coffee;
	}
}
