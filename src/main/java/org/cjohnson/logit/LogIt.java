package org.cjohnson.logit;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogIt {
	
	public static String defaultDateFormat = "hh:mm:ss:SSS";
	
	private final String loggerName;
	
	private SimpleDateFormat format;
	
	public LogIt(String loggerName) {
		this.loggerName = loggerName;
		
		format = new SimpleDateFormat(LogIt.defaultDateFormat);
	}
	
	private String getCurrentFormattedTime() {
		return format.format(new Date());
	}
	
	public void info(String message) {
		System.out.println("[" + getCurrentFormattedTime() + " INFO] " + message);
	}
	
	public void warn(String message) {
		System.out.println("[" + getCurrentFormattedTime() + " WARN] " + message);
	}
	
	public void severe(String message) {
		System.out.println("[" + getCurrentFormattedTime() + " SEVERE] " + message);
	}
	
}
