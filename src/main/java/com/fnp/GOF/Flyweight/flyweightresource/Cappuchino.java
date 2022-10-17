package flyweightresource;

public class Cappuchino{

	private String type;
	private boolean milk;

	public Cappuchino(String type, boolean milk){
		this.type = type;
	}

	public void setMilk(boolean milk){
			this.milk = milk;
	}
	
	public void brew(){
		System.out.println("type +" "+ milk);
	}
}
