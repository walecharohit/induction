package observerresource;

public class SubscriberOne implements Observer{
	
	public void update(Newspaper newspaper){
		System.out.println("SubscriberOne "+ newspaper.getPaper());
	}
}
