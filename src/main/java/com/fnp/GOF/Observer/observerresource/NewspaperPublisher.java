package observerresource;

import java.util.ArrayList;
import java.util.List;

public class NewspaperPublisher implements Publisher{

	private List<Observer> subscribers = new ArrayList<>();
	
		public void subscribe(Observer observer){
			subscribers.add(observer);
		}
		
		public void unsubscribe(Observer observer){
			subscribers.remove(observer);
		}
	
		public void deliver(Newspaper newspaper){
			for(Observer observer: subscribers){
				observer.update(newspaper);
			}
		}		
}
