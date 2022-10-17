package factoryresource;

public class Kitchen{

	public Food getFood(String food){
		if(food == "Pizza"){
			return new Pizza();
		}
		else if(food == "Burger"){
			return new Burger();
		}
					return null;
	}
}
