import vehiclefactory.*;

class Main{
	
	public static void main(String [] args){
	
		Car[] cars =  new Car[2] ; 
		Car wagonr = new Car();
		wagonr.setId(1);
		wagonr.setType("V-8");
		wagonr.setName("wagonR");
		wagonr.setNumofwheels(4);
		wagonr.setUtilitytype("Hatchback");
		wagonr.setEngineConfiguration("2 wheel drive");
		
		Car alto = new Car();
		alto.setId(2);
		alto.setType("V-12");
		alto.setName("Alto");
		alto.setNumofwheels(4);
		alto.setUtilitytype("Hatchback");
		alto.setEngineConfiguration("2 wheel drive");
				
		cars[0] = wagonr;
		cars[1] = alto;
	
		for(Car v: cars){
		if(v !=null){
			System.out.println("***********************************************");
			System.out.println("\n Id - " + v.getId() 		
			+ "\n Type - " +  v.getType() 
			+ "\n Name - " + v.getName() 
			+ "\n Number of Wheels - " + v.getNumofwheels() 
			+ "\n Utility Type - " + v.getUtilitytype() 
			+ "\n Engine Configuration - " + v.getEngineConfiguration());
			System.out.println("***********************************************");
		}
		}
	}

}
