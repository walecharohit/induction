package customexception;

public class ClassWhichThrowsException{
	  int variable1 = 5;
	 	public void conditionChecker(int variable2)throws ObservedException {
		if(variable1 != variable2){
			//System.out.println("Hi");
			throw new ObservedException("The condition does not follow. ");
	
		}
				//return 10;
	}
}
