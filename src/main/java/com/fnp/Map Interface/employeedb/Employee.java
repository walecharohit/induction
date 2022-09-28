package employeedb;

public class Employee{

	private int id;
	private String name;
	private String dept;
	private long phone;
	private float sal;
	
	public int getId(){
			return id;
	}
	
	public void setId(int id){
			this.id = id; 
	}
	public String getName(){
			return name;
	}
	
	public void setName(String name){
			this.name = name; 
	}
	
	public String getDept(){
			return dept;
	}
	
	public void setDept(String dept){
			this.dept = dept; 
	}
	
	public long getPhone(){
			return phone;
	}
	
	public void setPhone(long phone){
			this.phone = phone; 
	}
	
	public float getSal(){
			return sal;
	}
	
	public void setSal(float sal){
			this.sal = sal; 
	}
	
	public String toString(){
	
		return id +" "+ name+" "+dept+" "+phone+" "+sal;
	}
}

