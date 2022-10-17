package visitorresource;

public class PostalService implements Delivery{
	
	Delivery[] addresses;
	
	public PostalService(){
		addresses = new Delivery[] {new FirstAddress(), new SecondAddress(), new ThirdAddress() };
	}
	
	public void accept(DeliveryMan deliveryman){
		for(int i = 0; i<addresses.length; i++){
			addresses[i].accept(deliveryman);
		}
		deliveryman.deliver(this);
	}
}
