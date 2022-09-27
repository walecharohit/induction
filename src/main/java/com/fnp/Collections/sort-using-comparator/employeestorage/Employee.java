package employeestorage;

public class Employee implements Comparable<Employee>{

	int id;
	String name;
	String dept;
	long phone;
	float sal;
	
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
	
	public int compareTo(Employee employee){
		if(id>employee.id)
			return 1;
		else
			return-1;
	}
	
	public String toString(){
	
	return id +" "+ name+" "+dept+" "+phone+" "+sal;
	}
}
