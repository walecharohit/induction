package observerresource;

public class SubscriberThree implements Observer{
	
	public void update(Newspaper newspaper){
		System.out.println("SubscriberThree "+ newspaper.getPaper());
	}
}
