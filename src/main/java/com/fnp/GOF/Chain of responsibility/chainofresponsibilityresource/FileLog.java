package chainofresponsibilityresource;

public class FileLog extends Logger{

	public FileLog(int level){
		this.level = level;
	}
	
	protected void write(String message){
		System.out.println("File Log - " + message);
	}
}
