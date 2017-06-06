package com.sqa.anayak.ws;

import java.io.*;
import java.util.*;

import org.openqa.selenium.*;
import org.testng.annotations.*;

import com.sqa.anayak.helpers.*;

public class WSTest extends BasicTest {

	public WSTest(String baseUrl) {
		super("http://williams-sonoma.com");
	}

	@Test(enabled = true)
	public void readPropertiesTest() {
		Properties props = new Properties();
		InputStream input;
		try {
			input = new FileInputStream("src/main/resources/config.properties");
			props.load(input);
		} catch (FileNotFoundException e) {
			getLog().warn("Can not load config properties file because it was not found.");
		} catch (IOException e) {
			getLog().warn("Can not load config properties file can not be read.");
		}
	}

	@Test(enabled = false, priority = 0)
	public void testItemPurchase() {
		deletePopupAd();
	}

	@Test(enabled = false)
	public void testLogging() {
		this.getLog().error("Could not locate the requested web element");
		this.getLog().debug("The username entered for logging in is archiebin");
		this.getLog().trace("In the home page of the Williams-Sonoma home page");
		this.getLog().fatal("The site williams-sonoma could not be loaded, hence test fails");
		this.getLog().info(" The idea is to test the Williams-Sonoma project and close the popup window");
		this.getLog().warn("warning, test is being run by ignoring 20 warnings");
	}

	@Test(enabled = true)
	public void writePropertiesTest() {
		Properties props = new Properties();
		props.setProperty("test-name", "Williams Sonoma Test");
		props.setProperty("test-case", "ID101");
		props.setProperty("pass-fail", "pass");
		OutputStream output;
		try {
			output = new FileOutputStream("src/main/resources/test.properties");
			props.store(output, "Test Case Properties");
		} catch (FileNotFoundException e) {
			getLog().warn("Properties file can not access storage location");
		} catch (IOException e) {
			getLog().warn("Properties file can not be written");
		}
	}

	private void deletePopupAd() {
		if (this.present(By.className("stickyOverlayMinimizeButton"))) {
			WebElement popup = getDriver().findElement(By.className("stickyOverlayMinimizeButton"));
			this.getLog().info("Clicking popup.");
			this.takeScreenShots("WS-Test-Before");
			popup.click();
		} else

		{
			this.getLog().info("Did not find popup.");
		}
		this.takeScreenShots("WS-Test-After");
	}
}
