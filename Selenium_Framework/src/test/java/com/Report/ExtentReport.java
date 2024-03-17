package com.Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.dataio.FrameworkConstants;

final public class ExtentReport {
	
	private ExtentReport() {};
	public static  ExtentReports extent;
	public static ExtentTest testObj;
	public static void initReport() {
		extent =new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getExtenReportPath());
		extent.attachReporter(spark);
		
	}
	
	public static void flushReports() {
		extent.flush();
	}
	
	public static void createTestCaseName(String Name) {
		testObj =extent.createTest(Name);
		ExtentReportManager.SetExtent(testObj);
	}
	

}
