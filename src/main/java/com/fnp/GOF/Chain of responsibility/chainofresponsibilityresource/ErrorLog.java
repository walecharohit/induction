package chainofresponsibilityresource;

public class ErrorLog extends Logger{

	public ErrorLog(int level){
		this.level = level;
	}
	
	protected void write(String message){
		System.out.println("Error Log - " + message);
	}
}
