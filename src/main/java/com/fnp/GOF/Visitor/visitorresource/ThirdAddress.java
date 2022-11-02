package visitorresource;

public class ThirdAddress implements Delivery{

	public void accept(DeliveryMan deliveryman){
		deliveryman.deliver(this);
	}
}
