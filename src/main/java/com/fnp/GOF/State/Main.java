import stateresource.*;

class Main{

	public static void main(String [] args){
	
		Context context = new Context();
		
		Ice ice = new Ice();
		ice.transition(context);
		
		System.out.println(context.getState().toString());
		
		Water water = new Water();
		water.transition(context);
		
		System.out.println(context.getState().toString());
	}
}
