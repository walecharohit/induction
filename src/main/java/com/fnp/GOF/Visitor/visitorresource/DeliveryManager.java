package visitorresource;

public class DeliveryManager implements DeliveryMan{

	public void deliver(PostalService postalservice){
		System.out.println("Postal Service");
	}
	
	public void deliver(FirstAddress firstaddress){
		System.out.println("First delivery complete.");
	}

	public void deliver(SecondAddress secondaddress){
		System.out.println("Second delivery complete.");
	}
	
	public void deliver(ThirdAddress thirdaddress){
		System.out.println("Third delivery complete.");
	}
	
}
