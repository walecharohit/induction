import resourcecontainer.ObservedException;
import resourcecontainer.NumberEquality;

class Main{	
	
	public static void main(String [] args){
		
		try{
			NumberEquality equals = new NumberEquality();
			equals.conditionChecker(6);
		}
		catch(ObservedException e){
			System.out.println("Observed Exception is caught .");
			e.printStackTrace();
		}
		System.out.println("Control Moves Ahead");
	}
}
