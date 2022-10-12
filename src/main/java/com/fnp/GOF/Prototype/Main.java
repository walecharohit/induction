import pathogen.*;

public class Main{
	
	public static void main(String [] args){
	
	MedicalBase.getPathogen("parasite").addPathogen();
	MedicalBase.getPathogen("protozoa").addPathogen();
	MedicalBase.getPathogen("protozoa").addPathogen();
	MedicalBase.getPathogen("parasite").addPathogen();
	
	//MedBase n = new MedBase();
	
	//System.out.println(n.medBaseList);
	}
}
