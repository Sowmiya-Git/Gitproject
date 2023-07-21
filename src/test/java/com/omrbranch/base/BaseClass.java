package com.omrbranch.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	Robot robot;
	
	public void enterkey() throws AWTException {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
	
	public static WebDriver driver;


	// 1.Enter url
	public static void enterApplnUrl(String url) {
		driver.get(url);
	}

	// 2.maximize window
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public static String  getProjectpath() {
String property = System.getProperty("user.dir");
return property;
	}
	//getpropertyFilevalue
	public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties=new Properties();
		properties.load(new FileInputStream(getProjectpath()+"\\Configure\\config.Properties"));
		Object object = properties.get(key);
		String value=(String)object;
		return value;
		

	}
public static void getDriver(String browserType) {
	switch (browserType) {
	
	case "chrome":
		driver=new ChromeDriver();
		
		break;
	case "ie":
		driver=new InternetExplorerDriver();
		
		break;
	case "firefox":
		driver=new FirefoxDriver();
		
		break;
	case "edge":
		driver=new EdgeDriver();
		
		break;



	default:
		break;
	}

}
	

	// 3.Insert value in textbox
	public static void elementSendkeys(WebElement element, String data) {
		element.sendKeys(data);

	}

	// 4.clickbutton
	public void clickButton(WebElement element) {
		element.click();
	}

	// 5.click ok in alert
	public static void clickokAlert() {
		driver.switchTo().alert().accept();
	}

	// 6.click cancel in alert
	public void clickcancelAlert() {
		driver.switchTo().alert().dismiss();
	}

	// 7.get the text from webpage
	public String getText(WebElement element) {
		String text1 = element.getText();
		return text1;

	}

	// 8.get the insertedvalue in textbox
	public static void insertValue(WebElement element, String data) {
		element.sendKeys(data);
	}

	// 9.close all windows
	public static void closeAllwindows() {
		driver.close();
	}

	// 10.close all windows
	public static void closeCurrentwindows() {
		driver.quit();
	}
	//12getText
//	public String getText() {
//		String text = getText();
//		return text;
//		
//
//	}

	// 11.get the title
	public String gettheTitle(String title) {
		String title2 = driver.getTitle();
		return title2;

	}

	// 12.get the enterd url
	public String enteredUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	// 13.Select dropdown by text
	public void selectByText(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByVisibleText(data);

	}
	// 14.select dropdown by attribute

	public String selectByAtrribute(WebElement element, String data) {
		String attribute = element.getAttribute(data);
		return attribute;
	}

	// 15.Select dropdown by Index
	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	// 16.Insert the value in textbox by js

	// 17.click Button by js

	// 18.Launch the chromebrowser
	public static void browserLaunch() {
		driver = new ChromeDriver();
	}

	// 19.switch to Childwindow
	public static void switchTochildWindow() {
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		for (String eachwindow : allwindows) {
			if (!parentwindow.equals(eachwindow)) {
				driver.switchTo().window(eachwindow);

			}
		}
	}

	// 20.switch to frame by index
	public static void frameByindex(int i) {
		driver.switchTo().frame(i);

	}

	// 21.switch to frame by id
	public static void frameByid(String Id) {
		driver.switchTo().frame("Id");

	}

	// 22.Find Locator by id
	public WebElement locatorbyId(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;

	}
	// 22.Find Locator by id
		public WebElement locatorbyName(String attributeValue) {
			WebElement element = driver.findElement(By.name(attributeValue));
			return element;

		}

//	// 23.Find Locator by name
//	public WebElement locatorbyName(String atrributeValue) {
//		WebElement element = driver.findElement(By.name(atrributeValue));
//		return element;
//
//	}

	// 24.Find Locator by ClassName
	public WebElement locatorbyClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;

	}

	// 25.Find locator by xpath
	public WebElement locatorbyxpath(String exp) {
		WebElement element = driver.findElement(By.xpath(exp));
		return element;
	}

	// 26.Get all option from dropdown as text
	public void selectoptionBytext(WebElement element, String vivo) {
		Select select = new Select(element);
		select.selectByVisibleText(vivo);

	}

	// 27.Get all options from dropdown as attribute value
	public void selectoptionByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	// 28.Get the FirstSelected option text in dropdown
	public WebElement firstSelectedoption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

	// 29.verify in dropdown is multiselect option
	public boolean multiSelectedoption(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	// 30.Implicit wait
	public static void implicitywait(int i) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	} 

	// 31.Explicitly wait for visibility of f
	public static void visibilityof(WebElement element) {
		WebDriverWait driverwait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driverwait.until(ExpectedConditions.visibilityOf(element));
	}

	// 32.Fluent wait
	// 33.verify isDisplayed
	public boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	// 34.verify is Enabled
	public boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	// 35.verify is Selected
	public boolean isSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	// 36.Deselect ByIndex
	public void deselectByIndex(WebElement element, int i) {
		Select select = new Select(element);
		select.deselectByIndex(i);
	}

	// 37.DeSelectBy Attribute
	public void deselectByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	// 38.DeselectBy text
	public void deselectoptionBytext(WebElement element, String vivo) {
		Select select = new Select(element);
		select.deselectByVisibleText(vivo);

	}

	// 39.DeselectAll
	public void deselectoptionAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}
	// 40.Get the parentwindow
		private String getParentwindow() {
			String parentwindow = driver.getWindowHandle();
			return parentwindow;
		}

		// 41.get allwindow
		public Set<String> getAllwindow() {
			Set<String> allwindow = driver.getWindowHandles();
			return allwindow;
		}

		// 42.clear textbox
		public void clearTextbox(WebElement element) {
			element.clear();
		}

		// 43.TakeScreenshot
		public void Takescreenshot() throws IOException {
			// type casting
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File s = screenshot.getScreenshotAs(OutputType.FILE);
			File file = new File("C:\\Users\\R.KIRUTHIGA\\eclipse-workspace\\FrameWork9am\\screenshot.png");
			//FileUtils.copyFile(s, file);
		}

		// 44.Takescreenshot for element
		public void screenshotForelement(WebElement element) throws IOException {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File s = element.getScreenshotAs(OutputType.FILE);
			File file = new File("C:\\Users\\R.KIRUTHIGA\\eclipse-workspace\\FrameWork9am\\elememnt.png");
			//FileUtils.copyFile(s, file);

		}

		// 45.MouseoverAction for SingleOPtion
		public void actionforSingleoption(WebElement element) {
			Actions actions = new Actions(driver);
			actions.moveToElement(element).perform();
		}

		// 46.DragandDrop
		public void dragandDrop(WebElement source, WebElement dest) {
			Actions actions = new Actions(driver);
			actions.dragAndDrop(source, dest).perform();
		}

		// 47.RightClick
		public void actionRightclick(WebElement element) {
			Actions actions = new Actions(driver);
			actions.contextClick().perform();
		}

		// 48.doubleClick
		public void actionsDoubleclick(WebElement element) {
			Actions actions = new Actions(driver);
			actions.doubleClick().perform();
		}

		// 49.Insert value in textbox and enter
		public void textboxandEnter(WebElement element, String sowmi) {
			element.sendKeys(sowmi, Keys.ENTER);
		}

		// 50.Refresh page
		public void refreshPage() {
			Navigation navigate = driver.navigate();
			navigate.refresh();

		}
		// 51.key press
		 public void keyPress(int key) throws AWTException {
		 Robot robot=new Robot();
		 robot.keyPress(key);
		 }
		
		// }
		//// 51.key Release
		 public void keyRelease(int key) throws AWTException {
		 Robot robot=new Robot();
		 robot.keyRelease(key);
		
		 }

}
