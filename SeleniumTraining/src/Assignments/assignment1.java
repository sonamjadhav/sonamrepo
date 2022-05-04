package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

		public static void main(String[]args) {
			String path=".\\Executables\\chromedriver.exe";
//Launch a new chrome browser
		System.setProperty("webdriver.chrome.driver", path);
			
		ChromeDriver chrome=new ChromeDriver();
		//or		
		//WebDriver chrome=new ChromeDriver();		
		
//Open https://demo.actitime.com/
		chrome.get("https://demo.actitime.com/");
		
//Get page title name and title length
		chrome.getTitle();
		chrome.getTitle().length();
		
//Print page title and title length on the eclipse console
		System.out.println(chrome.getTitle());
		System.out.println(chrome.getTitle().length());
		
//Get page URL and verify if it is a correct page opened
		chrome.getCurrentUrl();
		if(chrome.getCurrentUrl().equals("https://demo.actitime.com/")) {
			System.out.println("Yes it is correct page opened.");
		}
		else {
			System.out.println("No it is not correct page opened.");
		}
		
//Get page source (HTML source code) and page source length
		chrome.getPageSource();
		chrome.getPageSource().length();
		
//Print page length on eclipse console
		System.out.println(chrome.getPageSource().length());
//Close the browser
		chrome.close();
		}
}
