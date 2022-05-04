package Assignments;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment3 {

	public static void main(String[] args) throws InterruptedException {
//		main1();
//		main2();
//		main3();
//		main4();
//		main5();
//		main6();
//		main7();
//		main8();
//		main9();
//		main10();
//		main11();
//		main12();
//		main13();
//		main14();
//		main15();
//		main16();
//		main17();
//		main18();
//		main19();
//		main20();
		main21();
	}
	
	static void main1() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",".\\Executables\\geckodriver.exe");
		FirefoxDriver F=new FirefoxDriver();
		
		F.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		F.get("https://demosite.executeautomation.com/Login.html");
		System.out.println("Title= "+ F.getTitle());
		System.out.println("Title legth= "+ F.getTitle().length());
		F.getCurrentUrl();
		if(F.getCurrentUrl().equals("https://demosite.executeautomation.com/Login.html")) {
			System.out.println("It is a correct page opened");
		}else {
			System.out.println("It is not a correct page opened");
		}
		
		F.findElement(By.name("UserName")).sendKeys("execution");
		F.findElement(By.name("Password")).sendKeys("admin");
		Thread.sleep(2000);
		F.findElement(By.cssSelector("input[value='Login']")).click();
		
		System.out.println("Title= "+ F.getTitle());
		System.out.println("Current url= "+ F.getCurrentUrl());
		
//		WebDriverWait wait=new WebDriverWait (F,20);
//		wait.until(ExpectedConditions.elementToBeClickable(F.findElement(By.tagName("span"))));
		
		F.findElement(By.cssSelector("a[href='Login.html']")).click();
		F.close();
	}
	
	static void main2() {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		
		chrome.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		chrome.get("https://demo.actitime.com/login.do");
		
		System.out.println("Title= "+ chrome.getTitle());
		if(chrome.getTitle().equals("actiTIME - Login")) {
			System.out.println("It is a correct title page");
		}else {
			System.out.println("It is not a correct title page");
		}
		
		chrome.findElement(By.id("username")).sendKeys("admin");
		chrome.findElement(By.name("pwd")).sendKeys("manager");
		chrome.findElement(By.id("loginButton")).click();
		
//		WebDriverWait wait=new WebDriverWait (chrome,50);
//		wait.until(ExpectedConditions.elementToBeClickable(chrome.findElement(By.id("logoutLink"))));
//		Thread.sleep(2000);
		chrome.findElement(By.id("logoutLink")).click();
		chrome.close();
	}
	
	static void main3() {
//		https://demo.vtiger.com/vtigercrm/index.php
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		
		chrome.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		chrome.get("https://demo.vtiger.com/vtigercrm/index.php");
		chrome.findElement(By.id("username")).clear();
		chrome.findElement(By.id("password")).clear();
		chrome.findElement(By.id("username")).sendKeys("admin");
		chrome.findElement(By.id("password")).sendKeys("Test@123");
		chrome.findElement(By.className("button")).click();
		
//		WebDriverWait wait=new WebDriverWait (chrome,50);
//		wait.until(ExpectedConditions.elementToBeClickable(chrome.findElement(By.tagName("body"))));
		
		chrome.findElement(By.cssSelector("span[title='Atlas Jeniffer(admin)']")).click();
		chrome.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		chrome.close();
	}
	
	static void main4() {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver",".\\Executables\\geckodriver.exe");
//		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(500, 700));
		driver.manage().window().maximize();
		
		String previous=driver.getTitle();
		System.out.println("Page title :"+previous);
		
		List<WebElement> Alloptions=driver.findElements(By.cssSelector("#nav-xshop>a"));
		for(int i=0; i<Alloptions.size(); i++) {
			
//			WebElement option=Alloptions.get(i);
//			String name=option.getText();
//			System.out.println("Option Name: "+name);
//			if(name.equals("Amazon Pay")) {
//				option.click();
//				break;
//			}
		
			if(Alloptions.get(i).getText().equals("Today's Deals")) {
				Alloptions.get(i).click();
				break;
			}
	}
		
//		driver.findElement(By.linkText("Best Sellers")).click();
		System.out.println("Page title :"+driver.getTitle());
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().back();
		String now=driver.getTitle();
		System.out.println("Page title :"+now);
		
		if(previous.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in" )) {
			System.out.println("Matched.......");
		}else {
			System.out.println("Not Matched.......");
		}
		driver.close();
	}
	static void main5() {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.demoblaze.com/");
		
		WebElement first=driver.findElement(By.cssSelector(".list-group>a:first-child"));
		System.out.println(first.isDisplayed());
		System.out.println(first.isEnabled());
		System.out.println(first.getText().equals("CATEGORIES"));
		first.click();
		
		WebElement second=driver.findElement(By.cssSelector(".list-group>a:nth-child(2)"));
		System.out.println(second.isDisplayed());
		System.out.println(second.isEnabled());
		System.out.println(second.getText().equals("Phones"));
		second.click();
//		driver.navigate().back();
		
		WebElement third=driver.findElement(By.cssSelector(".list-group>a:nth-child(3)"));
		System.out.println(third.isDisplayed());
		System.out.println(third.isEnabled());
		System.out.println(third.getText().equals("Laptops"));
		third.click();
//		driver.navigate().back();
		
		WebElement fourth=driver.findElement(By.cssSelector(".list-group>a:last-child"));
		System.out.println(fourth.isDisplayed());
		System.out.println(fourth.isEnabled());
		System.out.println(fourth.getText().equals("Monitors"));
		fourth.click();
//		driver.navigate().back();
		
		driver.close();
		
	}
	
	static void main6() {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		
		List<WebElement> menu=driver.findElements(By.cssSelector("._37M3Pb>div"));
		System.out.println("Main menu option count :"+menu.size());
		for(int i=0; i<menu.size(); i++) {
			System.out.println(menu.get(i).getText());
		}
		driver.close();
	}
	
	static void main7() {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.espncricinfo.com/");
		System.out.println(driver.getTitle());
		
		List<WebElement> menu=driver.findElements(By.cssSelector(".ds-bg-fill-navbar>div>div>div>div>div>a"));
		System.out.println("Main menu option count :"+menu.size());
		for(int i=0; i<menu.size(); i++) {
			System.out.println(menu.get(i).getText());
		}
		driver.close();
	}
	
	static void main8() {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/");
		System.out.println(driver.getTitle());
		
		List<WebElement> menu=driver.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
		System.out.println("Main menu option count :"+menu.size());
		for(int i=0; i<menu.size(); i++) {
			System.out.println(menu.get(i).getText());
		}
		driver.close();
	}
	
	static void main9() {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("a[href='samsung-phones-9.php']")).click();
		
		List<WebElement> menu=driver.findElements(By.cssSelector(".makers>ul>li>a>strong>span"));
		System.out.println("Main menu option count :"+menu.size());
		for(int i=0; i<menu.size(); i++) {
			System.out.println(menu.get(i).getText());
		}
		driver.close();
	}
	
	static void main10() {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement skills=driver.findElement(By.id("Skills"));
		Select skill=new Select(skills);
		
		System.out.println(skill.isMultiple());
		System.out.println(skill.getFirstSelectedOption().getText());
		skill.selectByVisibleText("APIs");
		skill.selectByValue("AutoCAD");
		skill.selectByIndex(1);
		
		List<WebElement> options=skill.getOptions();
		System.out.println("Options: "+options.size());
		for(int i=0; i<options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
	}
	
	static void main11() {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://omayo.blogspot.com/");
		
		WebElement skills=driver.findElement(By.id("multiselect1"));
		Select skill=new Select(skills);
		
		System.out.println(skill.isMultiple());
//		System.out.println(skill.getFirstSelectedOption().getText());
		skill.selectByVisibleText("Swift");
		skill.selectByValue("audix");
		skill.selectByIndex(0);
		
		List<WebElement> options=skill.getOptions();
		System.out.println("Options: "+options.size());
		for(int i=0; i<options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		
		List<WebElement> selectedoption=skill.getAllSelectedOptions();
		System.out.println("Selected Options: "+selectedoption.size());
		
		skill.deselectByVisibleText("Swift");
		skill.deselectByValue("audix");
		skill.deselectByIndex(0);
		skill.deselectAll();
		
		driver.close();
	}
	
	static void main12() {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector(".brandmenu-v2>ul>li:nth-child(14)>a")).click();
		System.out.println(driver.findElement(By.cssSelector(".nav-pages")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector(".nav-pages>strong")).getText());
		System.out.println(driver.findElement(By.cssSelector(".nav-pages>a[href='realme-phones-f-118-0-p2.php']")).getText());
		System.out.println(driver.findElement(By.cssSelector(".nav-pages>a[href='realme-phones-f-118-0-p3.php']")).getText());
		
		driver.findElement(By.cssSelector(".nav-pages>strong")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.cssSelector(".nav-pages>a[href='realme-phones-f-118-0-p2.php']")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.cssSelector(".nav-pages>a[href='realme-phones-f-118-0-p3.php']")).click();
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}
	
	static void main13() {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("._6luv._52jv>form>div:nth-of-type(5)>a")).click();
		
		WebElement day=driver.findElement(By.id("day"));
		Select selectday=new Select(day);
		System.out.println(day.isDisplayed());
		System.out.println(day.isEnabled());
		System.out.println(selectday.isMultiple());
		List<WebElement> options=selectday.getOptions();
		System.out.println(options.size());
		for(int i=0; i<options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		System.out.println(selectday.getFirstSelectedOption().getText());
		selectday.selectByVisibleText("12");
		System.out.println(selectday.getFirstSelectedOption().getText());
		
		WebElement day1=driver.findElement(By.id("month"));
		Select selectday1=new Select(day1);
		System.out.println(day1.isDisplayed());
		System.out.println(day1.isEnabled());
		System.out.println(selectday1.isMultiple());
		List<WebElement> options1=selectday1.getOptions();
		System.out.println(options1.size());
		for(int i=0; i<options1.size(); i++) {
			System.out.println(options1.get(i).getText());
		}
		System.out.println(selectday1.getFirstSelectedOption().getText());
		selectday1.selectByVisibleText("Feb");
		System.out.println(selectday1.getFirstSelectedOption().getText());
		
		WebElement day2=driver.findElement(By.id("year"));
		Select selectday2=new Select(day2);
		System.out.println(day2.isDisplayed());
		System.out.println(day2.isEnabled());
		System.out.println(selectday2.isMultiple());
		List<WebElement> options2=selectday2.getOptions();
		System.out.println(options2.size());
		for(int i=0; i<options2.size(); i++) {
			System.out.println(options2.get(i).getText());
		}
		System.out.println(selectday2.getFirstSelectedOption().getText());
		selectday2.selectByVisibleText("2016");
		System.out.println(selectday2.getFirstSelectedOption().getText());
		
		driver.close();
	}
	
	static void main14() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("Pune");
		driver.findElement(By.cssSelector(".homeSearch>*:nth-child(2)")).click();
		driver.findElement(By.id("dest")).sendKeys("Goa");
		driver.findElement(By.cssSelector(".homeSearch>*:nth-child(3)")).click();
		driver.findElement(By.cssSelector("td.next")).click();
		driver.findElement(By.cssSelector("div.rb-calendar>table>tbody>tr:nth-of-type(6)>td:nth-child(1)")).click();
		
		driver.findElement(By.id("search_btn")).click();
		
		WebElement check=driver.findElement(By.cssSelector(".dept-time.dt-time-filter>li:nth-child(4)>label:nth-of-type(1)"));
		wait.until(ExpectedConditions.elementToBeClickable(check));
		check.click();
		System.out.println(check.isSelected());
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		
		WebElement check1=driver.findElement(By.cssSelector(".list-chkbox>li:nth-child(3)>label:nth-of-type(1)"));
		wait.until(ExpectedConditions.elementToBeClickable(check1));
		check1.click();
		System.out.println(check1.isSelected());
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		
		List<WebElement> buses=driver.findElements(By.cssSelector(".travels.lh-24.f-bold.d-color"));
		List<WebElement> busprices=driver.findElements(By.cssSelector("div.bus-item-details>div.clearfix.row-one>*:nth-of-type(6)>div.seat-fare>div.fare>span"));
		System.out.println(buses.size());
		for(int i=0; i<buses.size(); i++) {
			System.out.println(buses.get(i).getText()+" "+busprices.get(i).getText());
		}
		driver.close();
	}
	
	static void main15() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		WebElement checkbox=driver.findElement(By.cssSelector("#keepLoggedInCheckBox"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.cssSelector(".item.createNewTasks")).click();
		
		driver.findElement(By.cssSelector("div.customerSelector.customerOrProjectSelector.selectorWithPlaceholderContainer>div.components_combobox>div.comboboxButton>div.selectedItem")).click();
		driver.findElement(By.xpath("//div[text()='Our company' and @class='itemRow cpItemRow ' or @class='itemRow cpItemRow selected']")).click();
		driver.findElement(By.cssSelector(".projectSelector>.components_combobox.cpCombobox>.comboboxButton>.selectedItem")).click();
		driver.findElement(By.cssSelector("tr.selectProjectRow.projectSelectorRow>td:nth-child(1)>div>div>div:nth-child(2)>div>div:nth-child(1)>div>div:nth-child(5)")).click();
		
		WebElement task=driver.findElement(By.cssSelector("tbody>tr>td.nameCell>input.inputFieldWithPlaceholder:nth-child(1)"));
		wait.until(ExpectedConditions.elementToBeClickable(task));
		task.click();
		task.sendKeys("Testing");
		
		driver.findElement(By.id("ext-gen45")).click();
		WebElement date=driver.findElement(By.id("ext-gen110"));
		wait.until(ExpectedConditions.elementToBeClickable(date));
		date.click();
		
		WebElement date1=driver.findElement(By.cssSelector("#ext-gen95>#ext-gen99>#ext-gen103>#ext-gen104>#ext-gen105>tbody>tr:nth-child(2)>td>table>tbody>tr:nth-child(3)>td:nth-child(2)"));
		wait.until(ExpectedConditions.elementToBeClickable(date1));
		date1.click();
		
		driver.findElement(By.cssSelector(".createTasksTable>tbody>tr:nth-child(1)>td:nth-child(5)>div.typeOfWorkButton.editable>div")).click();
		driver.findElement(By.cssSelector(".createTasksTable>tbody>tr:nth-child(1)>td:nth-child(5)>div:nth-child(1)>div>div>div:nth-child(1)>div>div:nth-child(11)>div")).click();
		
		driver.findElement(By.cssSelector(".basicLightboxFooter>div:nth-child(2)>div>div>div:nth-child(1)")).click();
		
		System.out.println("New task created is displayed or not :"+driver.findElement(By.cssSelector(".tasksTablesWrapper>div:nth-child(1)>table>tbody>tr>td:nth-child(2) div.title")).isDisplayed());
		
		WebElement tick=driver.findElement(By.cssSelector(".taskRow.noLastTrackingDate .img"));
		tick.click();
		wait.until(ExpectedConditions.elementToBeClickable(tick));
		System.out.println("New task is selected or not :"+tick.isSelected());
		
		driver.findElement(By.cssSelector(".delete.button")).click();
		driver.findElement(By.xpath("//span[text()='Delete permanently' and @class='submitTitle buttonTitle']")).click();
		
		List<WebElement> tasklist=driver.findElements(By.cssSelector(".tasksTable>div:nth-child(1)>div:nth-child(1)>div>div:nth-child(1)>div:nth-child(1)>div:nth-child(1)>div:nth-child(2)>table>tbody>tr>td.names div.title"));
		System.out.println("Total task :"+tasklist.size());
		for(int i=0; i<tasklist.size(); i++) {
		if(tasklist.get(i).getText().equals("Testing")) {
			System.out.println("New created Testing task is not deleted");
			break;
		}else {
			System.out.println("New created Testing task is deleted");
			break;
		}
		}
		driver.close();
	}
	
	static void main16() {
//		http://demo.automationtesting.in/Register.html
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement username=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		username.click();
		username.sendKeys("admin");
		
		Actions act=new Actions(driver);
		act.doubleClick(username).perform();
		username.sendKeys(Keys.chord(Keys.CONTROL,("C")));
		username.sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.chord(Keys.CONTROL,("V")),Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Pune",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("abc@gmail.com",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("1234567890",Keys.TAB,Keys.ARROW_RIGHT,Keys.TAB);
		driver.switchTo().activeElement().click();
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().click();
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().click();
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END) );
		
		WebElement language=driver.findElement(By.id("msdd"));
		wait.until(ExpectedConditions.elementToBeClickable(language));
		language.click();
		act.moveToElement(driver.findElement(By.cssSelector(".ui-corner-all>li:nth-child(8)"))).click().build().perform();
		driver.switchTo().activeElement().sendKeys(Keys.TAB,Keys.ENTER);
		driver.switchTo().activeElement().sendKeys("J",Keys.ENTER,Keys.TAB,Keys.ENTER);
		driver.findElement(By.cssSelector(".select2-selection.select2-selection--single")).click();
		driver.switchTo().activeElement().sendKeys("India",Keys.ENTER,Keys.TAB,Keys.ENTER);
		driver.switchTo().activeElement().sendKeys("2000",Keys.ENTER,Keys.TAB,Keys.ENTER);
		driver.switchTo().activeElement().sendKeys("April",Keys.ENTER,Keys.TAB,Keys.ENTER);
		driver.switchTo().activeElement().sendKeys("10",Keys.ENTER,Keys.TAB);
		driver.switchTo().activeElement().sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("admin",Keys.TAB,Keys.ENTER);
		driver.close();
	}
	
	static void main17() {
//		https://jqueryui.com/sortable/
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			WebDriverWait wait=new WebDriverWait(driver,30);
			
			driver.get("https://jqueryui.com/sortable/");
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
			
			
			driver.switchTo().frame(0);
			Actions act=new Actions(driver);
			WebElement item1=driver.findElement(By.cssSelector(".ui-state-default.ui-sortable-handle:nth-child(1)"));
			WebElement item7=driver.findElement(By.cssSelector(".ui-state-default.ui-sortable-handle:nth-child(7)"));
			act.dragAndDrop(item7, item1).perform();
			
			WebElement item2=driver.findElement(By.cssSelector(".ui-state-default.ui-sortable-handle:nth-child(2)"));
			WebElement item7_1=driver.findElement(By.cssSelector(".ui-state-default.ui-sortable-handle:nth-child(7)"));
			act.dragAndDrop(item7_1, item2).build().perform();
			
			WebElement item3=driver.findElement(By.cssSelector(".ui-state-default.ui-sortable-handle:nth-child(3)"));
			WebElement item7_2=driver.findElement(By.cssSelector(".ui-state-default.ui-sortable-handle:nth-child(7)"));
			act.dragAndDrop(item7_2, item3).build().perform();
			
			WebElement item4=driver.findElement(By.cssSelector(".ui-state-default.ui-sortable-handle:nth-child(4)"));
			WebElement item7_3=driver.findElement(By.cssSelector(".ui-state-default.ui-sortable-handle:nth-child(7)"));
			act.dragAndDrop(item7_3, item4).build().perform();
			
			WebElement item5=driver.findElement(By.cssSelector(".ui-state-default.ui-sortable-handle:nth-child(5)"));
			WebElement item7_4=driver.findElement(By.cssSelector(".ui-state-default.ui-sortable-handle:nth-child(7)"));
			act.dragAndDrop(item7_4, item5).build().perform();
			
			WebElement item6=driver.findElement(By.cssSelector(".ui-state-default.ui-sortable-handle:nth-child(6)"));
			WebElement item7_5=driver.findElement(By.cssSelector(".ui-state-default.ui-sortable-handle:nth-child(7)"));
			act.dragAndDrop(item7_5, item6).build().perform();
			
			driver.switchTo().defaultContent();
			driver.close();
	}
	
	static void main18() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		WebDriverWait wait=new WebDriverWait(driver,30);
		
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.cssSelector("#javascriptAlertsWrapper>div:nth-child(1)>div:nth-child(2)>button")).click();
		System.out.println("Alert text msg is: "+driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		WebElement alert=driver.findElement(By.cssSelector("#javascriptAlertsWrapper>div:nth-child(2)>div:nth-child(2)>button"));
		alert.click();
//		wait.until(ExpectedConditions.elementToBeSelected(alert));
		Thread.sleep(10000);
//		System.out.println("Alert text msg is: "+driver.switchTo().alert().getText());
		try {
		driver.switchTo().alert().accept();
		}catch(UnhandledAlertException e){
			driver.switchTo().alert().accept();
		}
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("#javascriptAlertsWrapper>div:nth-child(3)>div:nth-child(2)>button")).click();
		System.out.println("Alert text msg is: "+driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("#javascriptAlertsWrapper>div:nth-child(4)>div:nth-child(2)>button")).click();
		System.out.println("Alert text msg is: "+driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("admin");
		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
		driver.close();
	}
	
	static void main19() throws InterruptedException {
//		https://demo.vtiger.com/vtigercrm/index.php
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

		driver.findElement(By.cssSelector(".button.buttonBlue")).click();
		driver.findElement(By.cssSelector(".app-icon.fa.fa-bars")).click();

		List<WebElement> item = driver.findElements(By.cssSelector(".app-list.row>div"));
		Actions act = new Actions(driver);
		for (int i = 0; i < item.size(); i++) {
			if (item.get(i).getText().equals("MARKETING")) {
				act.moveToElement(item.get(i)).perform();
				break;
			}
		}
		WebElement contact=driver.findElement(By.xpath("//span[text()=' Contacts']"));
		wait.until(ExpectedConditions.elementToBeClickable(contact));
		contact.click();
		driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.xpath("//span[@class='select2-chosen' and @id='select2-chosen-2']")).click();
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Sonam",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Jadhav");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.cssSelector(".current-filter-name>a")).click();
		driver.findElement(By.cssSelector(".listViewEntriesCheckBox")).click();
		driver.findElement(By.id("Contacts_listView_massAction_LBL_EDIT")).click();
		
		WebElement title=driver.findElement(By.id("include_in_mass_edit_title"));
		wait.until(ExpectedConditions.elementToBeClickable(title));
		title.click();
		driver.findElement(By.id("Contacts_editView_fieldName_title")).sendKeys("Engg");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		WebElement check=driver.findElement(By.cssSelector(".table-actions>span>input"));
		wait.until(ExpectedConditions.elementToBeClickable(check));
//		Thread.sleep(2000);
		try {
		check.click();
		}
		catch(StaleElementReferenceException e) {
			check=driver.findElement(By.cssSelector(".table-actions>span>input"));
			check.click();
		}
		driver.findElement(By.id("Contacts_listView_massAction_LBL_DELETE")).click();
		driver.findElement(By.cssSelector(".btn.confirm-box-ok")).click(); 
		System.out.println("Contact deleted or not :"+check.isDisplayed());
		driver.close();
	}
	
	static void main20() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		driver.get("https://etrain.info/in");
		
		String homeid=driver.getWindowHandle();
		System.out.println("Homepage id :"+homeid);
		
		driver.findElement(By.cssSelector(".icon-linkedin")).click();
		
		Set<String> Allids=driver.getWindowHandles();
		System.out.println("All ids :"+Allids);
		
		Allids.remove(homeid);
		System.out.println("All ids :"+Allids);
		
		driver.switchTo().window(Allids.iterator().next());
		System.out.println("Linkedin page title: " + driver.getTitle());
		System.out.println("Linkedin page ulr: " + driver.getCurrentUrl());
//		driver.close();
		
		driver.switchTo().window(homeid);
		System.out.println("Linkedin page title: " + driver.getTitle());
		System.out.println("Linkedin page ulr: " + driver.getCurrentUrl());
//		driver.close();
		driver.quit();
	}
	
	static void main21() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		driver.get("https://www.saucedemo.com/");
		Actions act=new Actions(driver);
		WebElement user=driver.findElement(By.linkText("standard_user"));
		act.moveToElement(user).doubleClick().keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
	}
}
