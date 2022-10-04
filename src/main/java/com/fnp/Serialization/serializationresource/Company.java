package serializationresource;

import java.io.Serializable;

public class Company implements Serializable{	
	
	public static final long serialversionUID = 7642873L;
	private transient int id;
	private	String name;
	private transient String location;
	private static String dept;

	public void setId(){
		this.id = id;	
	}
	
	public int getId(){
		return id;
	}

	public void setName(){
		this.name = name;	
	}
	
	public String getName(){
		return name;
	}
	
	public void setLocation(){
		this.location = location;	
	}
	
	public String getLocation(){
		return location;
	}
	
	public void setDept(){
		this.dept = dept;	
	}
	
	public String getDept(){
		return dept;
	}
	
	
	public Company(int id,String name, String dept, String location){
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.location = location;
	}
	
	public String toString(){
		return id +" "+ name +" "+ dept +" "+ location;
	}
}

