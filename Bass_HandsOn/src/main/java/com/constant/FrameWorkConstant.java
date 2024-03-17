package com.constant;

public final class FrameWorkConstant {
	
	private FrameWorkConstant() {
		
	}
	
	private static final String CHROME_DRIVER_PATH = System.getProperty("User.dir")+ "\\src\\test\\resources\\DriverList\\chromedriver.exe";

	public static String getChromeDriverPath() {
		return CHROME_DRIVER_PATH;
	}
	

}
