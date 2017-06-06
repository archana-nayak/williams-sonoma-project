package com.sqa.anayak.ws;

import java.sql.*;

import org.testng.annotations.*;

import com.sqa.anayak.helpers.*;
import com.sqa.anayak.helpers.enums.*;
import com.sqa.anayak.helpers.exceptions.*;

public class ItemSearchTest extends BasicTest {

	public ItemSearchTest(String baseUrl) {
		super("http://williams-sonoma.com");
	}

	@Test(dataProvider = "textFileData")
	public void itemSearch(int id, String itemName, int quantity, double totalExpectedCost) {
		this.getLog().info("Testing data id " + id + " for item " + itemName + " and adding " + quantity
				+ " units for a total cost of $" + totalExpectedCost);
	}

	@DataProvider // Database data
	private Object[][] dbData() throws ClassNotFoundException, DataTypesMismatchException, SQLException,
			DataTypesCountException, DataTypesTypeException {
		return DataHelper.evalDatabaseTable("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:8889/wsdb", "root", "root",
				"ItemSearch", 0, 0, new DataType[] { DataType.INT, DataType.STRING, DataType.INT, DataType.FLOAT });
	}// press control space to see method signature

	@DataProvider // Hard Coded Data
	private Object[][] hcdata() {
		return new Object[][] { new Object[] { 1, "CoffeeMaker", 5, 23.4 }, new Object[] { 2, "Pans", 3, 56.8 },
				new Object[] { 3, "Pots", 2, 56.9 } };

	}

	@DataProvider
	private Object[][] newExcelData() throws InvalidExcelExtensionException {
		return DataHelper.getExcelFileData("src/main/resources/", "ItemSearchNewExcel.xlsx", false);
	}

	@DataProvider
	private Object[][] oldExcelData() throws InvalidExcelExtensionException {
		return DataHelper.getExcelFileData("src/main/resources/", "ItemSearchOldExcel.xls", false);
	}

	@DataProvider
	private Object[][] textFileData() {
		return DataHelper.getTextFileData("src/main/resources/", "ItemSearchText.csv", TextFormat.CSV,
				new DataType[] { DataType.INT, DataType.STRING, DataType.INT, DataType.DOUBLE });
	}

}
