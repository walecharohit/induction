import employeedb.*;
import java.util.*;
import java.io.*;
import java.lang.*;

class Main{
	
	public static void main(String [] args){
		
		HashMap<Integer, Employee> map = new HashMap<>();
				
		Employee john= new Employee();
		john.setId(2);
		john.setName("John");
		john.setDept("Tech");
		john.setPhone(747386537);
		john.setSal(35000);
		
		Employee jacob = new Employee();
		jacob.setId(1);
		jacob.setName("Jacob");
		jacob.setDept("Ecom");
		jacob.setPhone(73867);
		jacob.setSal(35000);
		
		Employee james = new Employee();
		james.setId(3);
		james.setName("James");
		james.setDept("Design");
		james.setPhone(738643);
		james.setSal(35000);
		
		map.put(1,john);
		map.put(2,jacob);
		map.put(3,james);
		
		for(Map.Entry<Integer,Employee> m:map.entrySet()){
			if(m.getValue().getId() == 2){
				int key = m.getKey();
				Employee g = m.getValue();
				System.out.println("Searched element is here :  key - "+m.getKey() + "   Value - " +m.getValue());
			}
		}
		}
		
	} 


