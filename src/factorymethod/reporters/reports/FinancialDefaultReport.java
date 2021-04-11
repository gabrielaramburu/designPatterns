package factorymethod.reporters.reports;

import factorymethod.report.Report;

public class FinancialDefaultReport implements Report{

	@Override
	public void createHeader() {
		System.out.println("Creating header Financial Report: Default");
	}

	@Override
	public void createBody() {
		System.out.println("Gathering information for Financial Report body: Default");
	}

	@Override
	public void createFooter() {
		System.out.println("Creating footer Financial Report: Default");
	}

	@Override
	public void generate() {
		System.out.println("Generatinf pdf of Finicial Report: Default");
	}

}
