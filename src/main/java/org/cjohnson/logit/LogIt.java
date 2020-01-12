/*
MIT License

Copyright (c) 2020 Collin Johnson

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

package org.cjohnson.logit;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * LogIt main class for logging utilities
 *
 * @since 1.0.0
 */
public class LogIt {
	
	/**
	 * Default Time format for formatting.
	 *
	 * @since 1.0.0
	 */
	public static String defaultDateFormat = "hh:mm:ss:SSS";
	
	/**
	 * Name of the logger instance.
	 *
	 * @since 1.0.0
	 */
	private final String loggerName;
	
	/**
	 * The class used for formatting dates.
	 *
	 * @since 1.0.0
	 */
	private SimpleDateFormat format;
	
	/**
	 * Standard constructor for LogIt
	 *
	 * @param loggerName Name of the logger
	 *
	 * @since 1.0.0
	 */
	public LogIt(String loggerName) {
		this.loggerName = loggerName;
		
		format = new SimpleDateFormat(LogIt.defaultDateFormat);
	}
	
	/**
	 * Format the current time
	 *
	 * @return Formatted Date and Time
	 *
	 * @since 1.0.0
	 */
	private String getCurrentFormattedTime() {
		return format.format(new Date());
	}
	
	/**
	 * Sends info message to console.
	 *
	 * @param message Message to send
	 *
	 * @since 1.0.0
	 */
	public void info(String message) {
		System.out.println("[" + getCurrentFormattedTime() + " INFO] " + message);
	}
	
	/**
	 * Sends warn message to console.
	 *
	 * @param message Message to send
	 *
	 * @since 1.0.0
	 */
	public void warn(String message) {
		System.out.println("[" + getCurrentFormattedTime() + " WARN] " + message);
	}
	
	/**
	 * Sends severe message to console.
	 *
	 * @param message Message to send
	 *
	 * @since 1.0.0
	 */
	public void severe(String message) {
		System.out.println("[" + getCurrentFormattedTime() + " SEVERE] " + message);
	}
	
}
