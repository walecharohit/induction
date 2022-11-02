package builderresource;

public interface Integration{
	
	public void requirementAnalysis(String requirementanalysis);
	public void designPhase(String designphase);
	public void prototypePhase(String prototypephase);
	public void testingPhase(String testingphase);
	public void betaPhase(String betaphase);
	
	public SoftwareDevelopment newassembly();
}
