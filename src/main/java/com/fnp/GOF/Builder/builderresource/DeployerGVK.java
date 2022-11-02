package builderresource;

public class DeployerGVK implements Integration{

	private SoftwareDevelopment software;
	
	public DeployerGVK(){
		this.software = new SoftwareDevelopment();
	}
	
	public void requirementAnalysis(String requirementanalysis){
		software.setRequirementAnalysis(requirementanalysis);	
	}
	
	public void designPhase(String designphase){
		software.setDesignPhase(designphase);
	}
	
	public void prototypePhase(String prototypephase){
		software.setPrototypePhase(prototypephase);
	}
	
	public void testingPhase(String testingphase){
		software.setTestingPhase(testingphase);
	}
	
	public void betaPhase(String betaphase){
		software.setBetaPhase(betaphase);
	}
	
	public SoftwareDevelopment newassembly(){
		return this.software;
	}
}
