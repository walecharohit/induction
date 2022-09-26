import employeestorage.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;


class Main{
		public static void main(String [] args){
			ArrayList<Employee> listOfEmployees = new ArrayList<>(); 
			Employee emp = new Employee(2, "John", "Tech", 36236323, 35000);
			Employee emp1 = new Employee(1, "Jacob", "ECOM", 48374348, 350000);
			listOfEmployees.add(emp);
			listOfEmployees.add(emp1);
			System.out.println("Unsorted : "+listOfEmployees);
			Collections.sort(listOfEmployees, new IdComparator());
			System.out.println("Sorted : "+listOfEmployees);
			for(Employee e : listOfEmployees){
				System.out.println(e);
			}
	}
}
