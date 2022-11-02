package proxyresource;

public class Proxy implements Server{

	private String data;
	
	private Real real;
	
	public Proxy(String data){
		this.data = data;
	}
	
	public void connect(){
		
		real = new Real(data);
		real.connect();
	}
}

