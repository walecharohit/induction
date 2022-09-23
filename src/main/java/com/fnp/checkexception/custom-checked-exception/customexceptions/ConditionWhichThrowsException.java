package customexceptions;

public class ConditionWhichThrowsException{
	 
	  int variable1 = 5;
	 	public void conditionChecker(int variable2)throws ObservedException{
			if(variable1 != variable2){
				throw new ObservedException("The condition does not follow. ");
			}
		}
}
