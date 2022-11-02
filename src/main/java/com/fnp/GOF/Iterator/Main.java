import iteratorresource.*;

class Main{
	
	public static void main(String [] args){
	
	try{
	Product cake = new Product("cake",1);
	
	ProductAggregate productaggregate = new ProductAggregateMethod();
	productaggregate.addProduct(cake);
	
	
	}catch(Exception e){
	
		e.printStackTrace();
	}
	
	}
}
