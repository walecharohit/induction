package strategyresource;

public class Calculator{
	
	private Strategy strategy;
	
	public Calculator(Strategy strategy){
		this.strategy = strategy;
	}
	
	public int calculateValues(int firstNum, int secondNum){
		return strategy.calculate(firstNum,secondNum);
	}
}
