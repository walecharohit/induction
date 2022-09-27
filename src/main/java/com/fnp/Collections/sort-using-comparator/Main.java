import employeestorage.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;


class Main{
		public static void main(String [] args){
			ArrayList<Employee> listOfEmployees = new ArrayList<>(); 
			
			Employee john = new Employee();
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
			
			listOfEmployees.add(john);
			listOfEmployees.add(jacob);
			System.out.println("Unsorted : "+listOfEmployees);
			Collections.sort(listOfEmployees);
			System.out.println("Sorted : "+listOfEmployees);
			for(Employee e : listOfEmployees){
				System.out.println(e);
			}
	}
}
