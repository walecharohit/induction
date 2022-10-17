package commandresource;

public class WaterControl{

	Controller onIntent, offIntent, undoIntent;
	
	public void onFlow(Controller onIntent){
		this.onIntent = onIntent;
		onIntent.execute();
		undoIntent = onIntent;
	}
	
	public void offFlow(Controller offIntent){
		this.offIntent = offIntent;
		offIntent.execute();
		undoIntent = offIntent;
	}
	
	public void revertFlow(){
		undoIntent.revert();
	}
}
