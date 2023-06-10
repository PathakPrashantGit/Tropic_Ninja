package UTILITY;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class EXTENTReports {

	public static ExtentReports getReports()
	{
		ExtentReports repo = new ExtentReports();
		ExtentSparkReporter sparkrepo = new ExtentSparkReporter("Reports.html");
		sparkrepo.config().setReportName("Web Automated By Prashant");
		sparkrepo.config().setDocumentTitle("Ninjas Report");
		repo.attachReporter(sparkrepo);
		repo.setSystemInfo("Tester", "Prashant");
		repo.setSystemInfo("Testing", "Regression");
		return repo;
	}
}
