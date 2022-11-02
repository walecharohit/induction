package commandresource;

public class WaterTapOff implements Controller{

	private WaterTap watertap;
	
	public WaterTapOff(WaterTap watertap){
		this.watertap = watertap;
	}
		
	public void execute(){
		System.out.println("WaterTapOff.execute() executed command.");
		watertap.turnOff();
	}
	
	public void revert(){
		System.out.println("WaterTapOff.revert() revert command.");
		watertap.turnOn();
	}
}
