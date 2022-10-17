package templateresource;

public abstract class CoffeeMachine{

	abstract void start();
	abstract void stop();
	
	public final void begin(){
		start();
		stop();
	}
}
