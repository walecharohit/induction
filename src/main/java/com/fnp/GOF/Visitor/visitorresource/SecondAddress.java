package visitorresource;

public class SecondAddress implements Delivery{

	public void accept(DeliveryMan deliveryman){
		deliveryman.deliver(this);
	}
}
