package compositeresource;
import java.util.*;

public class Countries {

	private String name;
	private int telcode;
	private List<Countries> states;
	  
	public Countries(String name,int telcode){
	
		this.name = name;
		this.telcode = telcode;
		states = new ArrayList<Countries>(); 
	}
	
	
	public String getName(){
		return name;
	}
	
	public int getTelcode(){
		return telcode;	
	}
	
	public void addStates(Countries c){
		states.add(c);
	}
	
	public void removeStates(Countries c){
		states.remove(c);
	}
	
	public List<Countries> getStates(){
		return states;
	}
	
	public String toString(){
		return name + " " + telcode;
	}

}	
	
