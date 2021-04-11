package factorymethod.report;

public abstract class Reporter {
	private Report report;
	
	public void generateReport(String type) {
		report = createInstance(type);
		
		report.createHeader();
		report.createBody();
		report.createFooter();
		report.generate();
	}

	/* this is a pattern drawback, every time a new report is implemented
	 * this code need to be modified violating the open close principle*/
	protected abstract Report createInstance(String type);
}
