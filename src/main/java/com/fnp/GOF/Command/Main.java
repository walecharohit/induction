import commandresource.*;

class Main{

	public static void main(String [] args){
		
		WaterControl control = new WaterControl();
		
		WaterTap tap = new WaterTap();
		
		Controller waterflowon = new WaterTapOn(tap);
		
		control.onFlow(waterflowon);
	
	  Controller waterflowoff = new WaterTapOff(tap);
	  control.offFlow(waterflowoff);
	  
		
	}
}
