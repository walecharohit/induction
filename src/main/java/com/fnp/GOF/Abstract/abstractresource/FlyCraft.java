package abstractresource;

public class FlyCraft{
	public static AircraftType getCraft(int typeselector){
		if(typeselector == 1){
				return new JetEngineAssembly();
		}	else{			
				return new HelicopterEngineAssembly();
		}
	}
}
