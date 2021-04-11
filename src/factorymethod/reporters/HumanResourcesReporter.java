package factorymethod.reporters;

import factorymethod.report.Report;
import factorymethod.report.Reporter;
import factorymethod.reporters.reports.HRDefaultReport;
import factorymethod.reporters.reports.HRMonthlyReport;
import factorymethod.reporters.reports.HRWeeklyReport;

public class HumanResourcesReporter extends Reporter{

	@Override
	protected Report createInstance(String type) {
		if (type.equals("monthly")) {
			return new HRMonthlyReport();
		} else if (type.equals("weekly")) {
			return new HRWeeklyReport();
		} else {
			return new HRDefaultReport();
		}
	}

}
