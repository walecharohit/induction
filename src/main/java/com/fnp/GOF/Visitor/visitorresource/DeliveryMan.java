package visitorresource;

public interface DeliveryMan{
	public void deliver(PostalService postalservice);
	public void deliver(FirstAddress firstaddress);
	public void deliver(SecondAddress secondaddress);
	public void deliver(ThirdAddress thirdaddress);
}
