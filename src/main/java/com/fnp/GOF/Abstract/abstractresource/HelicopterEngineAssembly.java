package abstractresource;

public class HelicopterEngineAssembly extends AircraftType{
	public Engine getEngine(String engineType){
			System.out.println("produce Helicopter "+ engineType);
		return new HelicopterEngine();
	}
}
