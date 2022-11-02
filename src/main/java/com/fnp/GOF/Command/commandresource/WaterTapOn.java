package commandresource;

public class WaterTapOn implements Controller{

	private WaterTap watertap;
	
	public WaterTapOn(WaterTap watertap){
		this.watertap = watertap;
	}
	
	public void execute(){
		System.out.println("WaterTapOn.execute() executed command.");
		watertap.turnOn();
	}
	
	public void revert(){
		System.out.println("WaterTapOn.revert() executed command.");
		watertap.turnOff();
	}
	
}
