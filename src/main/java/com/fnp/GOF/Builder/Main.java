import builderresource.*;

public class Main{
	public static void main(String [] args){
		
			Integration demosoftware = new DeployerMS();
			ReportingManager deployment = new ReportingManager(demosoftware);
			deployment.softwareState("To generate a new User Interface","Components of user interface","Create the new design flow","Testing the new deployment.","Deploy the new beta");
			SoftwareDevelopment software = deployment.newassembly();
			System.out.println(software);	
	}
}
