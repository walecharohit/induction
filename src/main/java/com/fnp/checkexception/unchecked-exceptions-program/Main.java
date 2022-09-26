import resourcecontainer.*;

class Main{	
	public static void main(String [] args){
	
	try{
			NumberEquality number = new NumberEquality();
			number.numberChecker(0);
	}
			
	catch(ObservedException e){
		System.out.println("Runtime Exception is caught");
		e.printStackTrace();
	}
		System.out.println("Control Moves Ahead");
	}
}
