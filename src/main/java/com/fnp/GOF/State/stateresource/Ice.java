package stateresource;

public class Ice implements State{
	
	public void transition(Context context){
		System.out.println("Ice State");
		context.setState(this);
	}	
	
	public String toString(){
		return "Ice";
	}
}
