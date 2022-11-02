package chainofresponsibilityresource;

public class ConsoleLog extends Logger{

	public ConsoleLog(int level){
		this.level = level;
	}
	
	protected void write(String message){
		System.out.println("Console Log" + message);
	}
}
