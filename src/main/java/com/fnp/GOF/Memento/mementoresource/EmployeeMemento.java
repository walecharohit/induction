package mementoresource;

public class EmployeeMemento{

	private int id;
	private String name;
	private long phone;
	private String dept;
	
	public EmployeeMemento(int id, String name, long phone, String dept){
		
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.dept = dept;
	
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public long getPhone(){
		return phone;
	}
	
	public String getDept(){
		return dept;
	}
	
	public String toString(){
		return "Current Memento State \n " + this.id + " " + this.name +" "+this.phone +" "+this.dept;
			
	}
}
