import abstractresource.*;

class Main{
	public static void main(String [] args){
		
		AircraftType jet = FlyCraft.getCraft(1);
		Engine jetengine = jet.getEngine("Yukikaze");
		jetengine.fireUp();
		
		AircraftType helicopter = FlyCraft.getCraft(0);
		Engine helicopterengine = helicopter.getEngine("Apache");
		helicopterengine.fireUp();
				
	}
}
