//////AFDP

interface Engine{	
	public void fireUp();
}

class Jet implements Engine{
	public void fireUp(){
		System.out.println("Jet engines On");
	}	
}

class Helicopter implements Engine{
	public void fireUp(){
		System.out.println("Helicopter engines On");
	}
}

abstract class AircraftType{
	abstract Engine getEngine(String engineType);
}

class JetEngineFactory extends AircraftType{
	public Engine getEngine(String engineType){
			System.out.println("produce Jet "+ engineType);
		return new Jet();		
	}
}

class HelicopterEngineFactory extends AircraftType{
	public Engine getEngine(String engineType){
			System.out.println("produce Helicopter "+ engineType);
		return new Helicopter();
	}
}

class FlyCraft{
	public static AircraftType getVehicle(String aircraft,int typeselector){
		if(typeselector == 1){
				return new JetEngineFactory();
		}	else{			
				return new HelicopterEngineFactory();
		}
	}
}

class Main{
	public static void main(String [] args){
		
		AircraftType jet = FlyCraft.getVehicle("true", 1);
		Engine e = jet.getEngine("Yukikaze");
		e.fireUp();
		
		AircraftType heli = FlyCraft.getVehicle("true", 0);
		Engine en = heli.getEngine("Apache");
		en.fireUp();
				
	}
}
