package visitorresource;

public class FirstAddress implements Delivery{

	public void accept(DeliveryMan deliveryman){
		deliveryman.deliver(this);
	}
}
