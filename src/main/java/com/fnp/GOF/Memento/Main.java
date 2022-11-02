import mementoresource.*;

class Main{

	public static void main(String [] args){
	
		Employee employee = new Employee(1,"John",7362764,"Tech");
		
		EmployeeMemento empmemento = employee.saveToMemento();
		EmployeeManager empmanager = new EmployeeManager();
		
		empmanager.addMemento(empmemento);
		
		employee.printInfo();//1John
		
		employee.setId(2);
		empmemento = employee.saveToMemento();
		empmanager.addMemento(empmemento);
		employee.printInfo(); //2John
		
		empmemento = empmanager.getMemento();
		employee.undoFromMemento(empmemento);
		employee.printInfo();//2John
		empmemento = empmanager.getMemento();
		employee.undoFromMemento(empmemento);
		employee.printInfo();//1John
		
	}
}
