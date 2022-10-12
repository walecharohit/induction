package pathogen;

import pathogen.*;

public class Protozoa extends Pathogen{
	public Protozoa(){
		this.pathogenName = "Malaria";
		this.medBaseId = 5798898;
	}
	
	@Override
	void addPathogen(){
		System.out.println("Pathogen is added to the medical Database. "+ this.medBaseId);
	}
}
