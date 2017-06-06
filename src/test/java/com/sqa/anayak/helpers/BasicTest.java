package com.sqa.anayak.helpers;

import java.util.concurrent.*;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public abstract class BasicTest extends Core {

	public BasicTest(String baseUrl) {
		super(baseUrl, null);
	}

	@BeforeClass
	public void setUp() throws Exception {
		this.setDriver(new FirefoxDriver());
		this.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.getDriver().get(this.getBaseUrl());
	}

	@BeforeClass(enabled = false)
	public void setUpChrome() throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		this.setDriver(new ChromeDriver());
		this.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.getDriver().get(this.getBaseUrl());
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		this.getDriver().quit();
	}

}
