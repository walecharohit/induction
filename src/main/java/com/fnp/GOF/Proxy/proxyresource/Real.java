package proxyresource;

public class Real implements Server{

	private String data;
	
	public Real(String data){
		this.data = data;
	}
	
	public void connect(){
		System.out.println("data displayed.");
	}
}

