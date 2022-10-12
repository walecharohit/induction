package pathogen;

import pathogen.*;

public class Parasite extends Pathogen{
	public Parasite(){
		this.pathogenName = "Tapeworm";
		this.medBaseId = 5656327;
	}
   
	@Override
	void addPathogen(){
		System.out.println("Parasite is added to the medical Database.");
	} 
}
