package resourcecontainer;

public class Equality{
	 
	  int num1 = 5;
	 	public void conditionChecker(int num2)throws ObservedException{
			if(num1 != num2){
				throw new ObservedException("The condition does not follow. ");
			}
		}
}
