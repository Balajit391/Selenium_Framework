package com.Report;

import com.aventstack.extentreports.ExtentTest;

public class ExtentReportManager {
	
	private static ThreadLocal<ExtentTest> threadLocalReport =new ThreadLocal<>();
	
	// Should not accessed by outside of package
	static ExtentTest getExtent() {
		return threadLocalReport.get();
	}
	
	static void SetExtent(ExtentTest test) {
		threadLocalReport.set(test);
	}

}
