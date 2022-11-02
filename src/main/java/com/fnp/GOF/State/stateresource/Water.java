package stateresource;

public class Water implements State{
	
	public void transition(Context context){
		System.out.println("Liquid State");	
		context.setState(this);
	}	
	
	public String toString(){
		return "Water";
	}
}
