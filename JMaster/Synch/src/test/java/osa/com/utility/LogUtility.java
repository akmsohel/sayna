package osa.com.utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class LogUtility {
	public static Logger getLog(Class clss) {
		Logger log=Logger.getLogger(clss);
		PropertyConfigurator.configure("src/test/resources/log4j.properties");
		return log;
		}

}
