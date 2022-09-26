package employeestorage;

import java.util.*;

public class IdComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee a, Employee b){
		return a.id - b.id; 
	}
	}
