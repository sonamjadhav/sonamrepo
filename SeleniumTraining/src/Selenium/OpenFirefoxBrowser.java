package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		
		String driverPath1 ="D:\\\\Software testing\\\\JAVA Workspace\\\\Selenium Training\\\\Executables\\\\geckodriver.exe";
				//or
		String driverPath2=".\\executables\\geckodriver.exe";
				//or
		String driverPath3=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		
		
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.gecko.driver", driverPath3);
		//step2: create an instance of Firefox Browser
		FirefoxDriver cdriver=new FirefoxDriver();
	}

}
