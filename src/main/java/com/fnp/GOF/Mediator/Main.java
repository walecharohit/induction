import mediatorresource.*;

class Main{
	
	public static void main(String [] args){
	
		User john = new User("John");
		User jacob = new User("Jacob");

		jacob.sendMessage("Hi");
		john.sendMessage("Hello");
		
		
	}
}
