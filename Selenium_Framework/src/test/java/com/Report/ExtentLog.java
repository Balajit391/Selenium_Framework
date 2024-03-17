package com.Report;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.utility.Utility;

public final class ExtentLog {
	
	private ExtentLog() {}
	
	public static void Pass(String info) {
		//ExtentReportManager.getExtent().pass(info);   //This will mark the status as Pass, Below code will mark it as pass and attach the Screenschot
		ExtentReportManager.getExtent().pass(info, MediaEntityBuilder.createScreenCaptureFromBase64String(Utility.getScreenCapture()).build());
	}

	public static void Fail(String info) {
		ExtentReportManager.getExtent().fail(info, MediaEntityBuilder.createScreenCaptureFromBase64String(Utility.getScreenCapture()).build());
	}

	public static void Info(String info) {
		ExtentReportManager.getExtent().info(info);
	}

}
