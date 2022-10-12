//BDP

interface Phases{
	
	void setRequirementAnalysis(String requirementanalysis);
	void setDesignPhase(String designphase);
	void setPrototypePhase(String prototypephase);
	void setTestingPhase(String testingphase);
	void setBetaPhase(String betaphase);

}

class AssemblyLine implements Phases{
	
	private String requirementanalysis;
	private String designphase;
	private String prototypephase;
	private String testingphase;
	private String betaphase;

	
	public void setRequirementAnalysis(String requirementanalysis){
		this.requirementanalysis = requirementanalysis;
	}
	
	public void setDesignPhase(String designphase){
		this.designphase = designphase;
	}
	
	public void setPrototypePhase(String prototypephase){
		this.prototypephase = prototypephase;
	}
	
	public void setTestingPhase(String testingphase){
		this.testingphase = testingphase;
	}
	
	public void setBetaPhase(String betaphase){
		this.betaphase = betaphase;
	}

	public String toString(){
		return requirementanalysis + " " + designphase + " " +  prototypephase + " " + testingphase  + " " + betaphase;
	
	}
}

interface Integration{
	
	public void requirementAnalysis();
	public void designPhase();
	public void prototypePhase();
	public void testingPhase();
	public void betaPhase();
	
	public AssemblyLine newassembly();
}

class DeployerMS implements Integration {
	
	private AssemblyLine software;

	public void DeployerMS(){
		this.software = new AssemblyLine();
	}
	
	public void requirementAnalysis(){
		software.setRequirementAnalysis("A new UI.");	
	}
	
	public void designPhase(){
		software.setDesignPhase("new prototype");
	}
	
	public void prototypePhase(){
		software.setPrototypePhase("new proto");
	}
	
	public void testingPhase(){
		software.setTestingPhase("new test");
	}
	public void betaPhase(){
		software.setBetaPhase("new beta");
	}
	
	public AssemblyLine newassembly(){
		return this.software;
	}
}

class DeployerGVK implements Integration{

	private AssemblyLine software;
	
	public void DeployerGVK(){
		this.software = new AssemblyLine();
	}
	
	public void requirementAnalysis(){
		software.setRequirementAnalysis("new field in ui");	
	}
	
	public void designPhase(){
		software.setDesignPhase("release");
	}
	
	public void prototypePhase(){
		software.setPrototypePhase("test alpha");
	}
	public void testingPhase(){
		software.setTestingPhase("new beta");
	}
	
	public void betaPhase(){
		software.setBetaPhase("user test deploy");
	}
	
	public AssemblyLine newassembly(){
		return this.software;
	}
}

class Manager{
	private Integration integration;
	
	public Manager(Integration integration){
		this.integration = integration;
	}
	
	public AssemblyLine newassembly(){
		return this.integration.newassembly();
	}

	public void assemblyManager(){
		this.integration.requirementAnalysis();
		this.integration.designPhase();
		this.integration.prototypePhase();
		this.integration.testingPhase();
		this.integration.betaPhase();
	}
}
	
class Main{
	public static void main(String [] args){
		try{
			Integration system = new DeployerMS();
			Manager application = new Manager(system);
			System.out.println(system);		
			application.assemblyManager();
			AssemblyLine software = application.newassembly();
			System.out.println(software);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}





        
