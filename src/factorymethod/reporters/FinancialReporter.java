package factorymethod.reporters;

import factorymethod.report.Report;
import factorymethod.report.Reporter;
import factorymethod.reporters.reports.FinancialDefaultReport;
import factorymethod.reporters.reports.FinancialMonthlyReport;
import factorymethod.reporters.reports.FinancialWeeklyReport;

public class FinancialReporter extends Reporter{

	@Override
	protected Report createInstance(String type) {
		if (type.equals("monthly")) {
			return new FinancialMonthlyReport();
		} else if (type.equals("weekly")) {
			return new FinancialWeeklyReport();
		} else {
			return new FinancialDefaultReport();
		}
	}

}
