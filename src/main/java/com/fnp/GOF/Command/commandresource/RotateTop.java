package commandresource;

public class RotateTop implements Controller{
	
	private RotatingTop rotatingtop;
	
	public RotateTop(RotatingTop rotatingtop){
		this.rotatingtop = rotatingtop;
	}
	
	public void execute(){
		System.out.println("RotateTop.execute() executed command.");
		rotatingtop.startRotating();
	}
	
	public void revert(){
		System.out.println("RotateTop.revert() executed command.");
		rotatingtop.stopRotating();
	} 
}
