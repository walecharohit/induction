import customexception.*;

class uncheckedException{	
	public static void main(String [] args){
	
	try{
			ClassWhichThrowsException obj = new ClassWhichThrowsException();
			obj.conditionChecker(0);
	}
			
	catch(ObservedException e){
		System.out.println("Runtime Exception is caught");
		e.printStackTrace();
	}
		System.out.println("Control Moves Ahead");
	}
}
