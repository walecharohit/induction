package employeestorage;

public class Employee{

	int id;
	String name;
	String dept;
	long phone;
	float sal;
	
	public Employee(int id, String name, String dept, long phone, float sal){
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.phone = phone;
		this.sal = sal;
	}
	public String toString(){
	
	return id +" "+ name+" "+dept+" "+phone+" "+sal;
	}
}
