package com.dataio;

import org.aeonbits.owner.ConfigFactory;

//This class will not be inherited
final public class ConfigurationFactory {
	
	
	// This don't allow anyone create object for this class
	private ConfigurationFactory() {}

	public static FrameworkConfig getconfig() {

		return ConfigFactory.create(FrameworkConfig.class);

	}
}