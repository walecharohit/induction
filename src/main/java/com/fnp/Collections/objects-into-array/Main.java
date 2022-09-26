import vehiclefactory.*;

class Main{
	
	public static void main(String [] args){
	
		VehicleFactory[] Vehicle =  new VehicleFactory[2] ; 
		VehicleFactory vehiclefactory = new VehicleFactory(1,"V - 8","G-ryd",4,"All Terrain Vehicle","descriptive Demo");
		VehicleFactory vehiclefactory2 = new VehicleFactory(2,"V - 12","k-pull zs",6,"Over Haul","descriptive Demo");
		Vehicle[0] = vehiclefactory;
		Vehicle[1] = vehiclefactory2;
		for(int i=0;i<Vehicle.length;i++){
		if(Vehicle[i] != null){
		System.out.print("***********************************************");
			System.out.println("\n Id - " + Vehicle[i].id 		
			+ "\n Type - " +  Vehicle[i].type 
			+ "\n Name - " + Vehicle[i].name 
			+ "\n Number of Wheels - " + Vehicle[i].numofwheels 
			+ "\n Utility Type - " + Vehicle[i].utilitytype 
			+ "\n Engine Configuration - " + Vehicle[i].EngineConfiguration);
			System.out.println("***********************************************");
		}
		}
		System.out.println("With forEach");
		//System.out.println(v);		
		for(VehicleFactory v : Vehicle){
		if(v !=null){
			System.out.println("***********************************************");
			System.out.println("\n Id - " + v.id 		
			+ "\n Type - " +  v.type 
			+ "\n Name - " + v.name 
			+ "\n Number of Wheels - " + v.numofwheels 
			+ "\n Utility Type - " + v.utilitytype 
			+ "\n Engine Configuration - " + v.EngineConfiguration);
			System.out.println("***********************************************");
		}
		}
	}

}
