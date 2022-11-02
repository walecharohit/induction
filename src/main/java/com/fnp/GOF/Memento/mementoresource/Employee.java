package mementoresource;

public class Employee{

	private int id;
	private String name;
	private long phone;
	private String dept;

	
	public Employee(int id, String name, long phone, String dept){
	
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.dept = dept;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setPhone(long phone){
		this.phone = phone;
	}
	
	public long getPhone(){
		return phone;
	}
	
	public void setDept(String dept){
		this.dept = dept;
	}
	
	public String getDept(){
		return dept;
	}

 	public EmployeeMemento saveToMemento(){
 		
 		EmployeeMemento empMemento = new EmployeeMemento(this.id, this.name, this.phone, this.dept);
 		return empMemento;
 	}
 	
 	public void undoFromMemento(EmployeeMemento memento){
 		
 		this.id = memento.getId();
		this.name = memento.getName();
		this.phone = memento.getPhone();
		this.dept = memento.getDept();
		
 	}
	
	public void printInfo(){
		String s = this.id + this.name;
		System.out.println(s);
	}

}
