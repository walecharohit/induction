import observerresource.*;

class Main{

	public static void main(String [] args){
		SubscriberOne one = new SubscriberOne();
		SubscriberTwo two = new SubscriberTwo();
		SubscriberThree three = new SubscriberThree();
		
		NewspaperPublisher p = new NewspaperPublisher();
		
		p.subscribe(one);
		p.subscribe(two);
		
		p.deliver(new Newspaper("news paper 1"));
		
		p.unsubscribe(one);
		p.subscribe(three);
		
		p.deliver(new Newspaper("news paper 2"));
	}
}
