package interpreterresource;

public class OrExpression implements Expression{
	private Expression firstexpression = null;
	private Expression secondExpression = null;
	
	public OrExpression(Expression firstexpression,Expression secondExpression){
		this.firstexpression = firstexpression;
		this.secondExpression = secondExpression;
	}
	
	public boolean interpret(String context){
	 return firstexpression.interpret(context) ||secondExpression.interpret(context);
	}
}
