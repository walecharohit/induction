package pathogen;

import java.lang.Cloneable;


public abstract class Pathogen implements Cloneable{
	
	protected String pathogenName;
	protected long medBaseId;

	abstract void addPathogen();
	public String toString(){
		return pathogenName + " " + medBaseId;	
	}
	//Shallow Copy
	public Object clone(){
		Object clone = null;
		try{
			clone = super.clone();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return clone;
		}
	}
