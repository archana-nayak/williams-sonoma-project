package com.sqa.anayak.google;

import java.io.*;

import org.apache.commons.io.*;
import org.openqa.selenium.*;
import org.testng.annotations.*;

import com.sqa.anayak.helpers.*;

public class GoogleTest extends BasicTest {

	public GoogleTest(String baseUrl) {
		super("http://www.google.com");
	}

	@Test
	public void googleTest() throws InterruptedException, IOException {
		Thread.sleep(5000);
		File srcFile = ((TakesScreenshot) this.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("Screenshots/" + "google" + ".png"));
	}

}
