package factorymethod.report;

public interface Report {
	
	public void createHeader();
	public void createBody();
	public void createFooter();
	public void generate();
}
