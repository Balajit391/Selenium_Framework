package com.dataio;

public final class FrameworkConstants {

	private FrameworkConstants() {}
	
	private final static String EXTENTREPORT_PATH =System.getProperty("user.dir")+"/ExtentReport/Index.html";
	
	public static String getExtenReportPath() {
		
		return EXTENTREPORT_PATH;
	}
	
	
}
