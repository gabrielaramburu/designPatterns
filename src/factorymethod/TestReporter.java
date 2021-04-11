package factorymethod;

import org.junit.jupiter.api.Test;

import factorymethod.report.Reporter;
import factorymethod.reporters.FinancialReporter;

public class TestReporter {
	@Test
	void testFinacialReporter() {
		Reporter financialReporter = new FinancialReporter();
		
		financialReporter.generateReport("weekly");
		financialReporter.generateReport("monthly");
		financialReporter.generateReport("default");
		
	}
}
