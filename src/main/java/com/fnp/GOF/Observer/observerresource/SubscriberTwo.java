package observerresource;

public class SubscriberTwo implements Observer{
	
	public void update(Newspaper newspaper){
		System.out.println("SubscriberTwo "+ newspaper.getPaper());
	}
}
