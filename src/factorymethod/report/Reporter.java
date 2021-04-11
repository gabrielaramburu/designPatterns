package factorymethod.report;

public abstract class Reporter {
	private Report report;
	
	public void generateReport(String type) {
		report = createInstance(type);
		
		System.out.println("*** Star report generation");
		report.createHeader();
		report.createBody();
		report.createFooter();
		report.generate();
		System.out.println("*** End report generation");
	}

	/* this is a pattern drawback, every time a new report is implemented
	 * this code need to be modified violating the open close principle*/
	protected abstract Report createInstance(String type);
}
