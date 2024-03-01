package webtool.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

	public static ExtentReports getReport() {
		// to generate report -> responsible for creating html file
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		// to change the report name
		reporter.config().setReportName("Automation Reports");
		// to change the report title
		reporter.config().setDocumentTitle("Test Results");
		
		// responsible for consolidating test execution results
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		return extent;
	}	
		
}
