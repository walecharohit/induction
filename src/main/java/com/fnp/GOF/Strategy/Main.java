import strategyresource.*;

class Main{

	public static void main(String [] args){
	
		Calculator calculator = new Calculator(new Addition());
		System.out.println(calculator.calculateValues(1,2));
	
		calculator = new Calculator(new Subtraction());
		System.out.println(calculator.calculateValues(2,1));

		calculator = new Calculator(new Multiplication());
		System.out.println(calculator.calculateValues(2,1));	
	
	}
}
