import compositeresource.*;

class Main{

	public static void main(String [] args){
	
		Countries usa = new Countries("USA",1);
		Countries uk = new Countries("UK",44);
		
		Countries texas = new Countries("Texas", 67);
		Countries england = new Countries("England", 87);
		
		
		usa.addStates(texas);
		uk.addStates(england);
	  
	  System.out.println(usa.getStates());
	}
}
