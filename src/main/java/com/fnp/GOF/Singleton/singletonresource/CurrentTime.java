package singletonresource;

public class CurrentTime{
	private static CurrentTime instance = new CurrentTime();
	
	private CurrentTime(){}
	
	public static CurrentTime getInstance(){
		return instance;
	}
	
	public void getTime(){
		System.out.println("Only one unique current time.");
	}
}
