package com.sqa.anayak.helpers;

import org.apache.log4j.*;
import org.openqa.selenium.*;

public class Core {

	private String baseUrl;

	private int currItem = 1;
	private WebDriver driver;
	Logger log = Logger.getLogger(this.getClass());

	/**
	 * @param baseUrl
	 * @param driver
	 */
	public Core(String baseUrl, WebDriver driver) {
		super();
		this.baseUrl = baseUrl;
		this.driver = driver;
	}

	/**
	 * @return the baseUrl
	 */
	public String getBaseUrl() {
		return this.baseUrl;
	}

	/**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return this.driver;
	}

	/**
	 * @return the log
	 */
	public Logger getLog() {
		return this.log;
	}

	public boolean present(By by) {

		return AutoBasics.isElementPresent(this.getDriver(), by);
	}

	/**
	 * @param baseUrl
	 *            the baseUrl to set
	 */
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	/**
	 * @param driver
	 *            the driver to set
	 */
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * 
	 * @return
	 */
	public boolean takeScreenShots() {
		return AutoBasics.takeScreenShots(getDriver(), "screenshots/", "Auto Test " + this.currItem++, getLog());
	}

	/**
	 * 
	 * @param fileName
	 * @return
	 */
	public boolean takeScreenShots(String fileName) {
		return AutoBasics.takeScreenShots(this.getDriver(), "screenshots/", fileName, getLog());
	}

}
