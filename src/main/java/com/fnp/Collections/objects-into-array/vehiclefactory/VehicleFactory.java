package vehiclefactory;

public class VehicleFactory extends Automotive{

	// How can we use this if its a dataMember in parent Class "super.EngineConfiguration";
	public int id;
	public String type;
	public String name;
	
	public VehicleFactory(int id, String type, String name, int numofwheels, String utilitytype,String EngineConfiguration){

		super(EngineConfiguration);
		this.id = id;
		this.type = type;
		this.name = name;
		this.numofwheels = numofwheels;
		this.utilitytype = utilitytype;
		//System.out.println(super.EngineConfiguration);
	}
}
