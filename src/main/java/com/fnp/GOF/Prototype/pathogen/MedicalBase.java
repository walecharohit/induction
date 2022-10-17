package pathogen;

import java.util.HashMap;
import java.util.Map;

public class MedicalBase{
	
	private static Map<String,Pathogen> medBaseList = new HashMap<String,Pathogen>();
	 
	static 
	{
			medBaseList.put("parasite", new Parasite());
			medBaseList.put("protozoa", new Protozoa());
			System.out.println(medBaseList);
	} 
	
	public static Pathogen getPathogen(String pathogenName){
		return (Pathogen) medBaseList.get(pathogenName).clone();
	}
}
