package exceptions;

class checkedExceptions{	
	
	public static void main(String [] args){
		
		try{
			ConditionWhichThrowsException condition = new ConditionWhichThrowsException();
			condition.conditionChecker(6);
		}
		catch(ObservedException e){
			System.out.println("Observed Exception is caught .");
			e.printStackTrace();
		}
		System.out.println("Control Moves Ahead");
	}
}
