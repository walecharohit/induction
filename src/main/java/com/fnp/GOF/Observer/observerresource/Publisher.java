package observerresource;

public interface Publisher{
	public void subscribe(Observer observer);
	public void unsubscribe(Observer observer);
	public void deliver(Newspaper newspaper);
}
