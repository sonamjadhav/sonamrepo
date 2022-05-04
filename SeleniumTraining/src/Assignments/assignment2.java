package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment2 {

	public static void main(String[] args) {
		
//		assignment2.ass();
		assignment2.ass1();
	}
		public static void ass(){
//Launch the web browser
		System.setProperty("webdriver.gecko.driver",".\\Executables\\geckodriver.exe");
		FirefoxDriver fire=new FirefoxDriver();
		//or		
		//WebDriver fire=new FirefoxDriver();	
		
//Open the url https://www.facebook.com in the current browser
		fire.get("https://www.facebook.com");
		
//Fetching home page title
		fire.getTitle();
		
//Verify actual title of the home page with the expected title
		if(fire.getTitle().equalsIgnoreCase("facebook")) {
			System.out.println("Yes it is correct title page opened.");
		}
		else {
			System.out.println("No it is not correct title page opened.");
		}
		
//Print home page title on the console
		System.out.println(fire.getTitle());
//Close the browser		
		fire.close();
	}
		public static void ass1(){
			System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
			ChromeDriver G=new ChromeDriver();
			
			G.get("https://www.google.com");
			G.getCurrentUrl();
			System.out.println(G.getCurrentUrl());
			G.getPageSource();
			G.close();
		}

}

