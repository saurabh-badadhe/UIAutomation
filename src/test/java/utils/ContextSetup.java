package utils;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class ContextSetup {
	public WebDriver driver;
	public String productName;
	public PageObjectManager pageObejctManager;
	public TestBase testBase;
	public GenericUtils genericUtils;

	public ContextSetup() throws IOException {

		testBase = new TestBase();
		pageObejctManager = new PageObjectManager(testBase.webDriverManager());
		genericUtils = new GenericUtils(testBase.webDriverManager());
	}
}
