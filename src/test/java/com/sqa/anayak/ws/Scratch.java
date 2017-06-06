package com.sqa.anayak.ws;

import org.openqa.selenium.*;
import org.testng.annotations.*;

import com.sqa.anayak.helpers.*;

public class Scratch extends BasicTest {

	public Scratch(String baseUrl) {
		super("http://williams-sonoma.com");
	}

	@Test(enabled = false)
	public void testAccountLink() {
		WebElement accountLink = this.getDriver()
				.findElement(By.xpath(".//*[@id='sub-brand-bar-container']/section/div/div/div[1]/a"));
		WebElement accountLinkByCss = this.getDriver().findElement(By.cssSelector(".my-account.dropDown.hoverFade>a"));
		// accountLink.click();
		// accountLinkByCss.click();
	}

	@Test(enabled = false)
	public void testBakewareLink() {
		WebElement cookieSheetsLink = this.getDriver()
				.findElement(By.xpath(".//*[@id='topnav-container']/ul/li[5]/div/div[1]/ul/li[4]/a"));
		WebElement cookieSheetsLinkCss = this.getDriver().findElement(By.cssSelector(".col>ul>li>a"));
	}

	@Test(enabled = false)
	public void testCalphalonUnderBakeware() {
		WebElement calphalonLink = this.getDriver()
				.findElement(By.xpath(".//*[@id='topnav-container']/ul/li[5]/div/div[2]/ul/li[5]/a"));
		WebElement calphalonLinkCss = this.getDriver().findElement(By.cssSelector(".col.hasDivider>ul>li>a"));
		// calphalonLink.click();
	}

	@Test(enabled = false)
	public void testCartLink() {
		WebElement cartLink = this.getDriver()
				.findElement(By.xpath(".//*[@id='sub-brand-bar-container']/section/div/div/div[3]/span[1]/a"));
		WebElement cartLinkCss = this.getDriver().findElement(By.cssSelector(".view-cart>span"));

		// cartLink.click();

	}

	@Test(enabled = false)
	public void testCheckout() {
		WebElement checkout = this.getDriver()
				.findElement(By.xpath(".//*[@id='sub-brand-bar-container']/section/div/div/div[3]/span[3]/a"));
		WebElement checkoutCss = this.getDriver().findElement(By.cssSelector(".checkout-button>a"));
		// checkout.click();

	}

	@Test(enabled = false)
	public void testSearchButton() {
		WebElement searchButton = this.getDriver().findElement(By.xpath(".//*[@id='btnSearch']"));
		WebElement searchButtonCss = this.getDriver().findElement(By.cssSelector(".checkout-button>a"));
		// searchButton.click();

	}

	@Test(enabled = false)
	public void testSearchField() {
		WebElement searchField = this.getDriver().findElement(By.xpath(".//*[@id='search-field']"));
		WebElement searchFieldCss = this.getDriver().findElement(By.cssSelector("#search-field"));
		// searchField.clear();
	}

	@Test(enabled = false)
	public void testTitleTab() {
		WebElement titleTab = this.getDriver()
				.findElement(By.xpath(".//*[@id='sub-brand-bar-container']/section/ul/li[1]/a"));
		WebElement titleTabByCss = this.getDriver()
				.findElement(By.cssSelector(".tab-williams-sonoma.tab-williams-sonoma_current"));
		// titleTab.click();

	}

}
