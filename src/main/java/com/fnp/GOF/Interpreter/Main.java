import interpreterresource.*;

class Main{
	public static void main(String [] args){
	
	Expression robert = new TerminalExpression("Robert");
	Expression john = new TerminalExpression("John");
	Expression ismale = new OrExpression(robert,john);
	System.out.println("Is Male " + ismale.interpret("John"));
	
	Expression secondcheck = new AndExpression(robert,john);
	System.out.println("Does exist " + ismale.interpret("John"));
	
	}
}
