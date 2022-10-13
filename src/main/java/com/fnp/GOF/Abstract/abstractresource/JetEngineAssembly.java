package abstractresource;

public class JetEngineAssembly extends AircraftType{
	public Engine getEngine(String engineType){
			System.out.println("produce Jet "+ engineType);
		return new JetEngine();		
	}
}
