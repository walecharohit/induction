import resourcecontainer.ObservedException;
import resourcecontainer.Equality;

class Main{	
	
	public static void main(String [] args){
		
		try{
			Equality equals = new Equality();
			equals.conditionChecker(6);
		}
		catch(ObservedException e){
			System.out.println("Observed Exception is caught .");
			e.printStackTrace();
		}
		System.out.println("Control Moves Ahead");
	}
}
