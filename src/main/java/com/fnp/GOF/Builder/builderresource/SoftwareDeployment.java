package builderresource;

public class SoftwareDevelopment implements Phases{
	
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

