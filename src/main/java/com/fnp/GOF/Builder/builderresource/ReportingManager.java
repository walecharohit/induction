package builderresource;

public class ReportingManager{
	private Integration integration;
	
	public ReportingManager(Integration integration){
		this.integration = integration;
	}
	
	public SoftwareDevelopment newassembly(){
		return this.integration.newassembly();
	}

	public void softwareState(String requirementanalysis, String designphase, String prototypephase, String testingphase, String betaphase){
		this.integration.requirementAnalysis(requirementanalysis);
		this.integration.designPhase(designphase);
		this.integration.prototypePhase(prototypephase);
		this.integration.testingPhase(testingphase);
		this.integration.betaPhase(betaphase);
	}
}
