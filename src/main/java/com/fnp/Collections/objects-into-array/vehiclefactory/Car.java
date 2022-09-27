package vehiclefactory;

public class Car extends Vehicle{

	private int id;
	private String type;
	private String name;
	
	public int getId(){
			return id;
	}
	
	public void setId(int id){
			this.id = id; 
	}
	
	public String getType(){
			return type;
	}
	
	public void setType(String type){
			this.type = type; 
	}
	
	public void setName(String name){
			this.name = name; 
	}
	
	public String getName(){
			return name; 
	}
}
