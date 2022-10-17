import visitorresource.*;

public class Main{
	public static void main(String [] args){
		
		Delivery delivery = new PostalService();
		delivery.accept(new DeliveryManager());
	
	}

}
