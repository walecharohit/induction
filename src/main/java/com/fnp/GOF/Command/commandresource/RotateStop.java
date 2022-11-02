package commandresource;

public class RotateStop implements Controller{
	
	private RotatingTop rotatingtop;
	
	public RotateTop(RotatingTop rotatingtop){
		this.rotatingtop = rotatingtop;
	}
	
	public void execute(){
		System.out.println("RotateStop.execute() + executed command.");
		rotatingtop.stopRotating();
	}
	
	public void revert(){
		System.out.println("RotateStop.revert() + executed command.");
		rotatingtop.startRotating();
	} 
}
